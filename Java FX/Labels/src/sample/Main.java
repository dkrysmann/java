package sample;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.File;

public class Main extends Application {

    private File bullet = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\blaster.png");

    private ImageView imgSpaceShip;
    private Pane pane;
    private ImageView imgPlanetEarth;

    @Override
    public void start(Stage primaryStage) throws Exception{
        pane = new Pane();
      //  Image spaceShip = new Image(getClass().getResourceAsStream("spaceship.png"));
        File spaceShipSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\spaceship.png");
        File earthSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\planet-earth.png");
        File planetUranusSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\planet-uranus.png");
        File spacePlanetSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\Space-Planet.png");
        File deathStarSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\death-star.png");


        Image planetEarth = new Image(earthSprite.toURI().toString());
        imgPlanetEarth = new ImageView(planetEarth);
        imgPlanetEarth.setFitHeight(150);
        imgPlanetEarth.setFitWidth(150);
        imgPlanetEarth.setX(100);
        imgPlanetEarth.setY(300);

        Image planetUranus = new Image(planetUranusSprite.toURI().toString());
        ImageView imgUranus = new ImageView(planetUranus);
        imgUranus.setFitHeight(150);
        imgUranus.setFitWidth(150);
        imgUranus.setX(340);
        imgUranus.setY(100);

        Image planetSaturn = new Image(spacePlanetSprite.toURI().toString());
        ImageView imgSaturn = new ImageView(planetSaturn);
        imgSaturn.setFitHeight(100);
        imgSaturn.setFitWidth(100);
        imgSaturn.setX(800);
        imgSaturn.setY(100);

        Image deathStar = new Image(deathStarSprite.toURI().toString());
        ImageView imgDeathStar = new ImageView(deathStar);
        imgDeathStar.setFitHeight(100);
        imgDeathStar.setFitWidth(100);
        imgDeathStar.setX(800);
        imgDeathStar.setY(400);

        final Image spaceShip = new Image(spaceShipSprite.toURI().toString());
        imgSpaceShip = new ImageView(spaceShip);
        imgSpaceShip.setFitHeight(Constant.SpaseShip.HEIGHT);
        imgSpaceShip.setFitWidth(Constant.SpaseShip.WIDTH);
        imgSpaceShip.setX(450);
        imgSpaceShip.setY(320);

        pane.getChildren().addAll(imgPlanetEarth,imgUranus,imgSaturn,imgDeathStar,imgSpaceShip);
        setupEventHandlers();

        Rectangle2D rect = Screen.getPrimary().getVisualBounds();

        Scene scene = new Scene(pane,rect.getWidth(),rect.getHeight());
        scene.setCursor(Cursor.NONE);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void setupEventHandlers() {

        pane.addEventFilter(MouseEvent.ANY, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                onMouseMoved(mouseEvent);
            }
        });

        pane.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                onMouseClicked(event);
            }
        });

    }

    private void onMouseClicked(MouseEvent event) {
        int bulletX = (int) event.getX() - 5;
        int bulletY = (int) event.getY() - Constant.SpaseShip.HEIGHT/2 - 5;


        addBullet(new Point(bulletX, bulletY));
    }

    private void addBullet(Point startPosition) {
        Image bulletImg = new Image(bullet.toURI().toString());
        ImageView bulletIv = new ImageView(bulletImg);
        bulletIv.setFitHeight(15);
        bulletIv.setFitWidth(15);
        bulletIv.setX(startPosition.getX());
        bulletIv.setY(startPosition.getY());

        pane.getChildren().add(bulletIv);

        animateToTop(bulletIv, startPosition);
    }

    private void animateToTop(final ImageView bulletIv,final Point startPosition) {
        Timeline timeline = new Timeline(new KeyFrame(
                Duration.millis(20),
                ae -> animateBulletFrame(bulletIv)));
        timeline.setCycleCount((int) (bulletIv.getY() / Constant.SpaseShip.BULLET_MOVEMENT_STEP ) + 2);
        timeline.play();
    }

    private void animateBulletFrame(ImageView bulletIv) {
        bulletIv.setY(bulletIv.getY() - Constant.SpaseShip.BULLET_MOVEMENT_STEP);
        System.out.printf("Bullet: Y: %f%n", bulletIv.getY());

        onBulletMoved(bulletIv.getX(), bulletIv.getY());
    }

    private void onBulletMoved(double x, double y) {
        System.out.printf("Earth: Y: %f%n", imgPlanetEarth.getY());
        if((y  <= (imgPlanetEarth.getY() + 150)) && (x <= imgPlanetEarth.getX() + 150)) {
            imgPlanetEarth.setVisible(false);
        }
    }

    private void onMouseMoved(MouseEvent event) {
        int shipPosX = (int) event.getX() -  Constant.SpaseShip.WIDTH/2;
        int shipPosY = (int) event.getY() - Constant.SpaseShip.WIDTH/2;

        imgSpaceShip.setX(shipPosX);
        imgSpaceShip.setY(shipPosY);
    }


    public static void main(String[] args)

    {
        launch(args);
    }
}

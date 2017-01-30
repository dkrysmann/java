package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
      //  Image spaceShip = new Image(getClass().getResourceAsStream("spaceship.png"));
        File spaceShipSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\spaceship.png");
        File earthSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\planet-earth.png");
        File planetUranusSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\planet-uranus.png");
        File spacePlanetSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\Space-Planet.png");
        File deathStarSprite = new File("D:\\projects\\Java\\Java FX\\Labels\\src\\sprites\\death-star.png");


        Image spaceShip = new Image(spaceShipSprite.toURI().toString());
        ImageView imgSpaceShip = new ImageView(spaceShip);
        imgSpaceShip.setFitHeight(90);
        imgSpaceShip.setFitWidth(90);
        imgSpaceShip.setX(450);
        imgSpaceShip.setY(320);

        Image planetEarth = new Image(earthSprite.toURI().toString());
        ImageView imgPlanetEarth = new ImageView(planetEarth);
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

        pane.getChildren().addAll(imgSpaceShip,imgPlanetEarth,imgUranus,imgSaturn,imgDeathStar);
        Scene scene = new Scene(pane,1024,1024);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}

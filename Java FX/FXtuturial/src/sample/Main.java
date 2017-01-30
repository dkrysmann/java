package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("MyWindow");
            primaryStage.setWidth(800);
            primaryStage.setHeight(700);
            Pane pane = new Pane();
        Button btn = new Button();
        btn.setText("Click");
            btn.setTranslateX(140);
            btn.setTranslateY(140);
            btn.setPrefSize(70,20);
        Rectangle rectangle = new Rectangle(100,100);
            btn.setOnAction(event -> {
               rectangle.setFill(Color.AZURE);
            });
        Scene scene = new Scene(pane);
        pane.getChildren().addAll(btn,rectangle);
            primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}

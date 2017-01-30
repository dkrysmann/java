package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       BorderPane borderPane = new BorderPane();
        VBox vBox = new VBox(10);
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        Button button1 = addButton("1");
        Button button2 = addButton("2");
        Button button3 = addButton("3");
        Button button4 = addButton("4");
        vBox.getChildren().addAll(button1,button2);
        hBox.getChildren().addAll(button3,button4);
        borderPane.setTop(hBox);
        borderPane.setTop(vBox);

        Scene scene = new Scene(borderPane,800,700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private Button addButton(String name){
        Button button = new Button(name);
        button.setPrefSize(70,20);
        return button;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

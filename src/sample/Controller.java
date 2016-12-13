package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {

    public TextField num1;
    public TextField num2;
    public TextField result;

    public void calculate(ActionEvent actionEvent) {
                try {

                    double firstNum = Double.parseDouble(num1.getText());
                    double secondNum = Double.parseDouble(num2.getText());
                    double resultInfo = firstNum + secondNum;
                    result.setText(String.valueOf(resultInfo));
                }
                catch (Exception error){
                    result.setText("Error");
                }
    }
}

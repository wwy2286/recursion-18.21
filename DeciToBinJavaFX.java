import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * Created by William Yu on 8/27/2017.
 */
public class DeciToBinJavaFX extends Application {
    public void start(Stage primaryStage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Decimal to Binary Converter");
        inputDialog.setContentText("Please enter a positive integer");
        inputDialog.showAndWait();
        long decimal = Long.parseLong(inputDialog.getResult());
        alert.setTitle("Decimal To Binary Converter");
        alert.setHeaderText("The integer " + decimal + " converted to binary is " + DecimalToBinary.toBinary(decimal));
        alert.showAndWait();
//    public static void main(String[]args){
//        Application.Launch(args);
//    }
    }
}

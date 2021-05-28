package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button startbtn;

    @FXML
    private Button profilebtn;

    @FXML
    private Button reportbtn;


    @FXML
    private Button startbtn1;


    @FXML
    void profilebtnaction(ActionEvent event) {

    }

    @FXML
    void reportbtnaction(ActionEvent event) {

    }

    @FXML
    void startbtnaction1(ActionEvent event) throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Person1.fxml"));
        primaryStage.setTitle("CahtAYAZ");
        primaryStage.setScene(new Scene(root, 427, 400));
        primaryStage.show();


    }

    @FXML
    void startbtnaction2(ActionEvent event) throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Person2.fxml"));
        primaryStage.setTitle("CahtAYAZ");
        primaryStage.setScene(new Scene(root, 427, 400));
        primaryStage.show();

    }


}

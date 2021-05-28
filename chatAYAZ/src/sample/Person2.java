package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Person2 {

    @FXML
    private TextArea ponerecieve;

    @FXML
    private TextArea ponesend;

    @FXML
    private Button sendbtn1;

    @FXML
    private Button showbtn1;

    @FXML
    void sendbtnaction1(ActionEvent event) {
        Persontwo.setText(ponesend.getText());

    }

    @FXML
    void showbtnaction1(ActionEvent event) {
        ponerecieve.setText(Personone.getText());

    }

}

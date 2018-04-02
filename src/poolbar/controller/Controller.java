package poolbar.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller {
    @FXML public Text txWelcome;
    @FXML private Text actiontarget;

    @FXML
    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        actiontarget.setText("Pressed");
    }
}

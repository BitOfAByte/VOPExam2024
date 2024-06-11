package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import recursion.Main;

public class PrimaryController {
    @FXML
    private RadioButton iterativeRadio;

    @FXML
    private RadioButton recursiveRadio;
    @FXML
    private TextField start;

    @FXML
    private TextField end;

    @FXML
    private TextArea output;

    public void initialize() {
        iterativeRadio.setSelected(true);
        recursiveRadio.setSelected(false);
    }


    public void executeAction(ActionEvent actionEvent) {
        int startValue = Integer.parseInt(start.getText());
        int endValue = Integer.parseInt(end.getText());
        if (iterativeRadio.isSelected()) {
            output.setText(String.valueOf(Main.iterativeOddSum(startValue, endValue)));
        } else {
            output.setText(String.valueOf(Main.recursiveOddSum(startValue, endValue)));
        }
    }

    public void clearAction(ActionEvent actionEvent) {
        start.clear();
        end.clear();
        output.clear();
    }

}
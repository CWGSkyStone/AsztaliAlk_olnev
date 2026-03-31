package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainMenuScene");
    }

}

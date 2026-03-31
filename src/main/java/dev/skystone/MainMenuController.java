package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) {
        App.setRoot("searchScene");
    }

}

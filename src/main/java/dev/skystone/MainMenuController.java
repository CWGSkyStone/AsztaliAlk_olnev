package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    void onClickAboutSceneButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickSearchSceneButton(ActionEvent event) {
        App.setRoot("searchScene");
    }

}

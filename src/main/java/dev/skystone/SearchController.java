package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchController {

    @FXML
    private Label countNameLabel;

    @FXML
    private TextField huNameField;

    @FXML
    private TextField itNameField;

    @FXML
    void initialize(){
        int size = App.nameDictList.size();
        countNameLabel.setText(String.valueOf(size));
    }

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainMenuScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) {
        String searchHuName = huNameField.getText();
        // String searchItName = itNameField.getText();
        for(NameDict nameDict : App.nameDictList){
            if(searchHuName.equals(nameDict.getHuName())){
                itNameField.setText(nameDict.getItName());
            }else if(!searchHuName.equals(nameDict.getHuName())){
                itNameField.setText("-");
            }
        }
    }
}

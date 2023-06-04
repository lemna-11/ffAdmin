package com.example.ffadmin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    public Label aRatherSussyLabel;

    @FXML
    public void openProductPage(){
        aRatherSussyLabel.setText("A sussy product line, hmmmmmmmmmmmmm");
    }

    @FXML
    public void openOrdersPage(){
        aRatherSussyLabel.setText("A sussy order even, maybe some cocaine milord?");
    }

    @FXML
    public void OpenCategoriesPage(){
        aRatherSussyLabel.setText("WE ONLY SELL AMONG US MERCH AND DRUGS");
    }

    @FXML
    public void exitApp(){
        System.exit(0);
    }
}
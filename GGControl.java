package com.example.gifgridfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GGControl {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}

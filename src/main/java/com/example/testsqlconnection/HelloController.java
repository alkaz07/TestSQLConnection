package com.example.testsqlconnection;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onTestButtonClick()
    {
        Ex2.testConnection1();
    }

    public void onAuthorsButtonClick()
    {
        System.out.println("минуточку...");
        ArrayList<String> authors = Ex2.loadAuthorNames();
        System.out.println(authors);
    }
}
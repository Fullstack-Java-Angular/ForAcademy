package com.foracademy.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField username;

    @FXML
    private TextField password;
    @FXML
    private Button login;

    public void buttonClick(ActionEvent actionEvent) {
        System.out.print("hello");
    }

}

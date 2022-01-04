package com.foracademy.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField username;

    @FXML
    private TextField password;
    @FXML
    private Button login;

    public void buttonClick(ActionEvent actionEvent) throws IOException {
        System.out.println("ok");
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("menu.fxml"));
        Scene menuScene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu");
        stage.setScene(menuScene);
        stage.show();
    }

}

package com.foracademy.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

  /*  @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)  {
        launch(args);
    }*/
     Button button1, button2;
     Scene scene1;
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage ) throws Exception{
        primaryStage.setTitle("Welcome to ForAcademy school");

        // start GridPan
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15,15,15,15));
        grid.setVgap(8);
        grid.setHgap(10);

        // user name
        Label label1 = new Label("Your Name : ");
        GridPane.setConstraints(label1, 1, 1);

        TextField nameInput1 = new TextField();
        nameInput1.setPromptText("entre your name");
        GridPane.setConstraints(nameInput1,1,2);

        // user pass word
        Label label2 = new Label("Your passWord : ");
        GridPane.setConstraints(label2, 1, 3);

        TextField passwordInput2 = new TextField();
        passwordInput2.setPromptText("entre your pass word");
        GridPane.setConstraints(passwordInput2,1,4);

        // button login
        Button button = new Button("login");
        GridPane.setConstraints(button,1,5);

        grid.getChildren().addAll(label1,nameInput1,label2,passwordInput2,button);




         scene1 = new Scene(grid,500,400);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }



}
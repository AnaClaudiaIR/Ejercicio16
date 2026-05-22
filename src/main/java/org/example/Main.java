package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
//import java.awt.*;
//import java.awt.TextField; --> No se necesitan estos imports
import javafx.scene.control.*;

import java.util.Optional;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulario con varios botones");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

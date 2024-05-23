package com.example.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("inicio_sesion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 335, 600);
        stage.setTitle("EstuBook");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch(args);}
}

package com.example.proyecto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.security.cert.PolicyNode;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inicio_Sesion {

    @FXML
    private Button inicioBOTON;
    @FXML
    private Text id_email;
    @FXML
    private TextField pass;
    @FXML
    private Text id_pass;
    @FXML
    private ImageView logo;
    @FXML
    private TextField email;
    @FXML
    private AnchorPane panelInicioSesion;
    @FXML
    private Button crearBOTON;

    @FXML
    public void initialize() {

    }
    @FXML
    public void inicioBOTONclick(ActionEvent actionEvent) {
            System.out.println("funciona bien");
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("Eventos.fxml"));
            this.panelInicioSesion.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    public void crearBOTONCLICK(ActionEvent actionEvent) {
            System.out.println("funciona bien");
            try {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("Registro.fxml"));
                this.panelInicioSesion.getChildren().setAll(pane);
            } catch (IOException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }



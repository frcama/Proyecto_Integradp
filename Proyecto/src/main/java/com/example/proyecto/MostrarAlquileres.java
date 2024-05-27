package com.example.proyecto;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.util.ArrayList;

public class MostrarAlquileres extends Conexion{
    @javafx.fxml.FXML
    private Label nombreAlquilerLabel;
    @javafx.fxml.FXML
    private Label nHabsAlquilerLabel;
    @javafx.fxml.FXML
    private Label precioAlquilerLabel;
    @javafx.fxml.FXML
    private ImageView imagenalquilerImageView;
    @javafx.fxml.FXML
    private Label metrosAlquilerLabel;
    @javafx.fxml.FXML
    private Label ubiAlquilerLabel;
    @javafx.fxml.FXML
    private AnchorPane panelMostrarAlquiler;
    @javafx.fxml.FXML
    private Label descripcionAlquilerLabel;


    public void listar(Alquileres al) {

             nombreAlquilerLabel.setText(al.getNombre());
             ubiAlquilerLabel.setText(al.getUbicacion());
             metrosAlquilerLabel.setText(al.getMetrosCuadrados());
             nHabsAlquilerLabel.setText(String.valueOf(al.getnHabitaciones()));
             descripcionAlquilerLabel.setText(al.getDescripcion());
             precioAlquilerLabel.setText(String.valueOf(al.getPrecio()));
             imagenalquilerImageView.setImage(al.getImagen());

        }
    }


package com.example.proyecto;

import javafx.scene.image.Image;
import javafx.scene.shape.Path;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlquileresModel extends Conexion{



    public ArrayList<Alquileres> mostrarAlquileres() {

        ArrayList<Alquileres> alquileresLista = new ArrayList<>();

        try {
            String sql = "Select * from alquileres;";
            PreparedStatement ps = this.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Image combertir = new Image(rs.getBlob("imagen").getBinaryStream());
                Alquileres a = new Alquileres(rs.getString("ubicacion"), rs.getString("nombre"), rs.getDouble("precio"), rs.getString("metrosCuadrados"),combertir, rs.getInt("nHabitaciones"), rs.getString("Descripcion"));
                alquileresLista.add(a);
            }

            rs.close();
            ps.close();
            conexion.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return alquileresLista;
        }
}

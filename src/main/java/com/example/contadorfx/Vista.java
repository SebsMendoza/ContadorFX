package com.example.contadorfx;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Vista extends VBox {
    private int contador = 0;

    public Vista() {
        initVista();
    }

    public void initVista() {
        Label pantalla = new Label("0");
        pantalla.setAlignment(Pos.CENTER);
        pantalla.setFont(new Font(25));
        pantalla.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        pantalla.setText("" + contador);
        Button botonMas = new Button("incrementar");
        Button botonMenos = new Button("decrementar");

        HBox teclado = new HBox();
        teclado.getChildren().addAll(botonMas, botonMenos);

        this.getChildren().addAll(pantalla, teclado);

        botonMas.setOnAction(e -> pantalla.setText("" + (++contador)));
        botonMenos.setOnAction(e -> pantalla.setText("" + (--contador)));
    }
}

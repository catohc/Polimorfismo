package com.example.poli.Controllers;

import com.example.poli.App;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private Button BttnAgregar;

    @FXML
    private Button BttnModificar;

    @FXML
    private Button BttnVer;

    @FXML
    private Button Bttnsalir;

    @FXML
    void BttnAgregar(MouseEvent event) {
        App.newStage("Agregars.fxml","Agregar estudiantes");
    }

    @FXML
    void BttnModificar(MouseEvent event) {
        App.newStage("Updates.fxml","Modificar");
    }

    @FXML
    void BttnVer(MouseEvent event) {
        App.newStage("Verbds.fxml","Ver Bases");
    }

    @FXML
    void Bttnsalir(MouseEvent event) {
        Platform.exit();
    }

}

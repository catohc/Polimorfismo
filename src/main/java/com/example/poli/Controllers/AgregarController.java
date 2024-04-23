package com.example.poli.Controllers;

import com.example.poli.App;
import com.example.poli.Models.Base1;
import com.example.poli.Models.Server;
import com.example.poli.Models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AgregarController {

    @FXML
    private Button Bttnsave;

    @FXML
    private TextField Iapellido;

    @FXML
    private TextField Imatricula;

    @FXML
    private TextField Inombre;

    @FXML
    private Button bttnexit;
    private Server server = App.getRegistro();

    @FXML
    void Bttnsave(MouseEvent event) {
        if (server != null) {
            String nombre = Inombre.getText();
            String apellido = Iapellido.getText();
            String matricula = Imatricula.getText();
            Student student = new Student(nombre, apellido, matricula);
            try {
            if (server.getBase1().getList1()!=null) {
                server.getBase1().salvars(student);
                Alert alertI = new Alert(Alert.AlertType.INFORMATION);
                alertI.setHeaderText("Estudiante guardado en la base 1");
                alertI.setContentText("estudiante agregado con exito");
                alertI.showAndWait();
            }
            if (server.getBase2().getList2()!= null) {
                server.getBase2().salvars(student);
                Alert alertI = new Alert(Alert.AlertType.INFORMATION);
                alertI.setHeaderText("Estudiante guardado en la base 2");
                alertI.setContentText("estudiante agregado con exito");
                alertI.showAndWait();
            }
            if (server.getBase3().getList3()!= null) {
                server.getBase3().salvars(student);
                Alert alertI = new Alert(Alert.AlertType.INFORMATION);
                alertI.setHeaderText("Estudiante guardado en la base 3");
                alertI.setContentText("estudiante agregado con exito");
                alertI.showAndWait();
            }
            } catch (Exception e) {
                System.err.println("Error al guardar el estudiante: " + e.getMessage());
            }
        }else {
            Alert alertE = new Alert(Alert.AlertType.ERROR);
            alertE.setHeaderText("Error con el servidor");
            alertE.setContentText("no se pudo agregar un estudiante");
            alertE.showAndWait();
        }
    }

    @FXML
    void bttnexit(MouseEvent event) {
        App.getStageView().close();
    }

}
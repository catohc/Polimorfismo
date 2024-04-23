package com.example.poli.Controllers;

import com.example.poli.App;
import com.example.poli.Models.Base3;
import com.example.poli.Models.Server;
import com.example.poli.Models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class UpdateController {

    @FXML
    private Button BttnBandU;

    @FXML
    private Button Bttnsaven;

    @FXML
    private TextField Buscar;

    @FXML
    private TextField Inapellido;

    @FXML
    private TextField Inmatricula;

    @FXML
    private TextField Innombre;

    @FXML
    private TableColumn<Student, String> apellidon;

    @FXML
    private Button bttnexit;

    @FXML
    private TableColumn<Student, String> matn;

    @FXML
    private TableColumn<Student,String> nombren;

    @FXML
    private TableView<Student> vern;
    private Server server = App.getRegistro();
    @FXML
    void BttnBandU(MouseEvent event) {
        Base3 base3 = new Base3();
        if (server != null && server.getBase3()!=null&&server.getBase3().getList3()!=null){
            vern.getItems().addAll(server.getBase3().getList3());
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista se encuentra vacia.");
            alert.showAndWait();
        }
    }

    @FXML
    void Bttnsaven(MouseEvent event) {
        String name = Innombre.getText();
        String apellido = Inapellido.getText();
        String mat = Inmatricula.getText();
        String newname =Buscar.getText();
        if (name.isEmpty() || apellido.isEmpty() || mat.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Rellene los campos correctamente.");
            alert.showAndWait();
        }else{
            boolean encontrado = false;
            for (Student student: vern.getItems()){
                if (name.equals(student.getNombre())){
                    student.setNombre(newname);
                    student.setApellido(apellido);
                    student.setMatricula(mat);
                    server.actu(student);
                    encontrado = true;
                    Innombre.clear();
                    Inapellido.clear();
                    Inmatricula.clear();
                }else{
                    Alert alertI = new Alert(Alert.AlertType.INFORMATION);
                    alertI.setHeaderText("Estudiante no encontrado");
                    alertI.setContentText("No se detecto ningun estudiante con ese nombre");
                    alertI.showAndWait();
                }
            }
            if (encontrado){
                vern.getItems().clear();
                vern.getItems().addAll(server.getBase3().getList3());
            }
        }
    }

    @FXML
    void bttnexit(MouseEvent event) {
        App.getStageView().close();
    }
    @FXML
    void initialize() {
        nombren.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        apellidon.setCellValueFactory(cellData -> cellData.getValue().apellidoProperty());
        matn.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());

    }
}

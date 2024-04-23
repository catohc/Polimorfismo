package com.example.poli.Controllers;
import com.example.poli.App;
import com.example.poli.Models.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class VerController {

    @FXML
    private AnchorPane Actu;

    @FXML
    private TableColumn<Student, String> apellido1;

    @FXML
    private TableColumn<Student, String> apellido2;

    @FXML
    private TableColumn<Student, String> apellido3;

    @FXML
    private Button bttnexit;

    @FXML
    private TableColumn<Student, String> mat1;

    @FXML
    private TableColumn<Student, String> mat2;

    @FXML
    private TableColumn<Student, String> mat3;

    @FXML
    private TableColumn<Student, String> nombre1;

    @FXML
    private TableColumn<Student, String> nombre2;

    @FXML
    private TableColumn<Student, String> nombre3;

    @FXML
    private TableView<Student> ver1;

    @FXML
    private TableView<Student> ver2;

    @FXML
    private TableView<Student> ver3;
private Server server = App.getRegistro();
    @FXML
    void Actu(MouseEvent event) {
        Base1 base1 = new Base1();
        Base2 base2 = new Base2();
        Base3 base3 = new Base3();
        if (server.getBase1().getList1() != null && server.getBase2().getList2() != null && server.getBase3().getList3() != null){
            ver1.getItems().addAll(server.getBase1().getList1());
            ver2.getItems().addAll(server.getBase2().getList2());
            ver3.getItems().addAll(server.getBase3().getList3());
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista esta vacía.");
            alert.showAndWait();
        }
    }

    @FXML
    void bttnexit(MouseEvent event) {
        App.getStageView().close();
    }
    @FXML
    void initialize() {

        nombre1.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        apellido1.setCellValueFactory(cellData -> cellData.getValue().apellidoProperty());
        mat1.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());

        nombre2.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        apellido2.setCellValueFactory(cellData -> cellData.getValue().apellidoProperty());
        mat2.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());

        nombre3.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        apellido3.setCellValueFactory(cellData -> cellData.getValue().apellidoProperty());
        mat3.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());
    }
}

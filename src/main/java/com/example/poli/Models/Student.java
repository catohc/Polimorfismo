package com.example.poli.Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
    private final StringProperty nombre;
    private final StringProperty apellido;
    private final StringProperty matricula;

    public Student(String nombre, String apellido, String matricula) {
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.matricula = new SimpleStringProperty(matricula);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellido() {
        return apellido.get();
    }

    public StringProperty apellidoProperty() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido.set(apellido);
    }

    public String getMatricula() {
        return matricula.get();
    }

    public StringProperty matriculaProperty() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula.set(matricula);
    }
}

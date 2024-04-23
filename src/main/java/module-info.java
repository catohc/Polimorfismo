module com.example.poli {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.poli to javafx.fxml;
    exports com.example.poli;
    opens com.example.poli.Controllers;
    exports com.example.poli.Controllers;
}
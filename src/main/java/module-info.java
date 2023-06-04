module com.example.ffadmin {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    opens com.example.ffadmin to javafx.fxml;
    exports com.example.ffadmin;
}
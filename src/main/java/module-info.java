module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
requires java.desktop;
requires javafx.graphics;
requires javafx.base;
requires javafx.fxmlEmpty;
requires javafx.web;
requires javafx.swing;
    requires org.controlsfx.controls;

    opens com.example.demo1 to javafx.fxml;
    exports com.example.demo1;
}
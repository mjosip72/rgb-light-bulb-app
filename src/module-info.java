module RGB.Light.Bulb {

    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;

    exports main;
    opens main to javafx.fxml;

}
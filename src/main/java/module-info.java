module civ {

    requires javafx.controls;
    requires javafx.fxml;


    opens civ to javafx.fxml;
    exports civ;
    exports civ.Controller;
    opens civ.Controller to javafx.fxml;

}
module sn.dev.javafx_usermanagementapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens sn.dev.javafx_usermanagementapp to javafx.fxml;
    exports sn.dev.javafx_usermanagementapp;
}
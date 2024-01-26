module com.example.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens Chapter01 to javafx.fxml;
    exports Chapter01;
}
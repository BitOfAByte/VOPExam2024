module org.example.vopexam24exercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example to javafx.fxml;
    exports org.example;
}
module com.example.dictionarynew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dictionarynew to javafx.fxml;
    exports com.example.dictionarynew;
}
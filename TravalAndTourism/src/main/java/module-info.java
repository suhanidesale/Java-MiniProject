module com.example.travalandtourism {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.travalandtourism to javafx.fxml;
    exports com.example.travalandtourism;
}
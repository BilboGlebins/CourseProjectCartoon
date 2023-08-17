module com.example.courseprojectcartoon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.courseprojectcartoon to javafx.fxml;
    exports com.example.courseprojectcartoon;
}
module com.example.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens loose.oose.fis.lab.student.manager.model to javafx.fxml;
    exports loose.oose.fis.lab.student.manager.model;
}
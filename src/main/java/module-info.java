module ru.vsu.cs.task4.rerenderer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vsu.cs.task4.rerenderer to javafx.fxml;
    exports ru.vsu.cs.task4.rerenderer;
}
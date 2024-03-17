module com.example.demosnake {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                            requires com.almasb.fxgl.all;
    
    opens com.example.demosnake to javafx.fxml;
    exports com.example.demosnake;
}
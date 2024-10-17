module es.israeldelamo.customcomponent {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.israeldelamo.customcomponent to javafx.fxml;
    exports es.israeldelamo.customcomponent;
}
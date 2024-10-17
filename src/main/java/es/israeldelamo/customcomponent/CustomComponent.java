package es.israeldelamo.customcomponent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class CustomComponent extends VBox {

    @FXML private Button plusBtn;
    @FXML private Button minusBtn;
    @FXML private Label label;

    public CustomComponent() {
        FXMLLoader loader = new FXMLLoader(
                CustomComponent.class.getResource(
                        "custom-component.fxml"
                )
        );
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void newText(String text) {
        label.setText(text);
    }
}
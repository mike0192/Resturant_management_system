package CONTROLLER;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
public class LoginController {
    @FXML private TextField userField;
    @FXML private PasswordField PassField;
    @FXML private Button LogButton;

    @FXML
    public void handleLogin(ActionEvent event){
        String user = userField.getText();
        String pass = PassField.getText();

    if (user.isEmpty() || pass.isEmpty()) {
            showAlert("Please enter a username and a password.");
            return;
        }

    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Failed");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

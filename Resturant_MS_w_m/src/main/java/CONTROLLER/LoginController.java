package CONTROLLER;
import DATABASE.mysqlDBConnection;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.sql.*;


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

    if (authenticateUser(user, pass)) {
            showSuccess("Login Successful!");
            // Navigate to StaffView
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/StaffView.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            showAlert("Invalid username or password.");
        }
    }

    private boolean authenticateUser(String username, String password) {
        String sql = "SELECT * FROM Staff WHERE username = ? AND password = ?";

        try (Connection con = mysqlDBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            return rs.next(); // Returns true if user exists

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Failed");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void showSuccess(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    }




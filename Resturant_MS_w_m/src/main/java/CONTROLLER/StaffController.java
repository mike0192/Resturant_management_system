package CONTROLLER;

import DAO.IStaffDAO;
import DAO.StaffImp;
import MODEL.Staff;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class StaffController {
    @FXML private TextField IDField;
    @FXML private TextField NameField;
    @FXML private TextField RoleField;
    @FXML private TextField PhoneField;
    @FXML private TextField DateField;
    @FXML private Button AddButton;
    @FXML private Button UpdateButton;
    @FXML private Button DeleteButton;
    @FXML private Button SearchButton;

    StaffImp dao = new StaffImp();

    @FXML
    public void initialize(){}

    @FXML
    private void handleSearch(ActionEvent event){
        String input = IDField.getText().trim();

        if(input.isEmpty()) {
            ShowAlert("Input Error", "Please enter a staff id to search! ");
            return;

            Staff staff = dao.searchstaffById(input);

            if (staff != null) {
                IDField.setText(staff.getId());
                NameField.setText(staff.getName());
                RoleField.setText(staff.getRole());
                PhoneField.setText(String.valueOf(staff.getPhone()));
                DateField.setText(String.valueOf(staff.getDate()));


            } else {
                ShowAlert("Not Found", "No staff found with this ID: " + input);
                clearFields();
            }

        }

        }
    private void clearFields() {
        IDField.clear();
        NameField.clear();
        RoleField.clear();
        PhoneField.clear();
        DateField.clear();
    }
    private void ShowAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("❌ Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void ShowSuccess(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("✅ Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    }
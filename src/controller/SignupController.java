package controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignupController {
	@FXML
	private TextField username;
	@FXML
	private TextField studentNumber;
    @FXML
	private TextField firstname; 
    @FXML
	private TextField lastname;
    @FXML
	private PasswordField password; 
	@FXML
	private Button createUser;
	@FXML
	private Button login;
	@FXML
	private Label status;
	
	private Stage stage;
    private Stage parentStage;

    public SignupController(Stage parentStage){
        this.stage = new Stage();
        this.parentStage = parentStage;

    }

    @FXML
    public void initialize(){
        login.setOnAction(event -> {
            stage.close();
            parentStage.show();
        });
        createUser.setOnAction(event -> {
            status.setVisible(true);
            status.setText("sign up clicked");
        });
    }

    public void showStage(Parent root) {
		Scene scene = new Scene(root);
        status.setVisible(false);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Sign up");
		stage.show();
	}
    
}

package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Label message;
	@FXML
	private Button login;
	@FXML
	private Button signup;
    
    
    private Stage stage;
    
    public  LoginController(Stage stage){
        this.stage = stage;
    }
    public void initialize() {		
		login.setOnAction(event -> {
			message.setText("Login clicked");
		});
		
		signup.setOnAction(event -> {
            message.setText("sign up clicked");
            try {
            
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/SignupView.fxml"));
                Parent root = loader.load();
                stage.setScene(new Scene(root));
                stage.show();
        
            } catch (IOException | RuntimeException e) {
                Scene scene = new Scene(new Label(e.getMessage()), 200, 100);
                stage.setTitle("Error");
                stage.setScene(scene);
                stage.show();
            }
			// try {
			// 	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SignupView.fxml"));
				
			// 	// Customize controller instance
			// 	SignupController signupController =  new SignupController(stage, model);

			// 	loader.setController(signupController);
			// 	VBox root = loader.load();
				
			// 	signupController.showStage(root);
				
			// 	message.setText("");
			// 	name.clear();
			// 	password.clear();
				
			// 	stage.close();
			// } catch (IOException e) {
			// 	message.setText(e.getMessage());
			// }
        });
	}

    public void showStage(Parent root) {
		Scene scene = new Scene(root);
        // message.setVisible(false);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Welcome");
		stage.show();
	}
    

}

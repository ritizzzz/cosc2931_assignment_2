package controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Model;

public class HomeController {
    @FXML
	private Button signout;
    @FXML
    private Label studentNumber;
    @FXML
    private Label firstName;
    @FXML
    private Label lastName;

    private Stage stage;
    private Stage parentStage;
    private Model model;

    public HomeController(Stage parentStage, Model model){
        this.stage = new Stage();
        this.parentStage = parentStage;
        this.model = model;

    }

    
	@FXML
	public void initialize() {	
        studentNumber.setText(Integer.toString(model.getCurrentStudent().getStudentNumber()));
        firstName.setText((model.getCurrentStudent().getFirstName()));
        lastName.setText(model.getCurrentStudent().getLastName());

		signout.setOnAction(event -> {
            stage.close();
            parentStage.getScene().lookup("#message").setVisible(false);
            parentStage.show();
        });
	}


    public void showStage(Parent root) {
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Dashboard");
		stage.show();
	}
    
}

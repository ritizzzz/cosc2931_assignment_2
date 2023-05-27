package controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Model;

public class HomeController {
    @FXML
	private Button signout;


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


import java.io.IOException;
import java.sql.SQLException;

import controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
     
        
        // Parent root = FXMLLoader.load(getClass().getResource("view/login.fxml"));
        

        // primaryStage.setTitle("Login");
        // primaryStage.setScene(new Scene(root));
        // primaryStage.show();


        try {
            
			FXMLLoader loader = new FXMLLoader(getClass().getResource("view/LoginView.fxml"));
			
			LoginController loginController = new LoginController(primaryStage);

			loader.setController(loginController);

			Parent root = loader.load();

            loginController.showStage(root);
	
		} catch (IOException | RuntimeException e) {
			Scene scene = new Scene(new Label(e.getMessage()), 200, 100);
			primaryStage.setTitle("Error");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
    }
 public static void main(String[] args) {
        launch(args);
    }
}
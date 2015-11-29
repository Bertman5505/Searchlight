package co.za.bertus.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestApp extends Application
{

	public static void main(String[] args) 
	{
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
		Parent root = loader.load();		
		MainController controller = loader.getController();
		controller.init(primaryStage);
		Scene scene = new Scene(root, 600, 400);
		scene.getStylesheets().add("/fxml/styles/Main.css");
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
		
	}

}

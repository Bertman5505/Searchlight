package co.za.bertus.main;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MainController implements Initializable
{
	private Stage stage;
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle)
	{
		
	}
	
	public void init(Stage primaryStage)
	{
		this.stage = stage;
		
	}
	
	public void openFile()
	{
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Text File");
		fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"),
												 new FileChooser.ExtensionFilter("All Files", "*.*"));
		
		File file = fileChooser.showOpenDialog(stage);
		
		if(file != null)
		{
			System.out.println("Choose File:" + file);
		}
	}
	
	public void doExit()
	{
		Platform.exit();
	}


	
	

}

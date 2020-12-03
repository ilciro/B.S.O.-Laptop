package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BuondaryHomePage {
	@FXML
	private Pane pane;
	@FXML
	private GridPane grid;
	@FXML
	private Label header;
	@FXML
	private Button buttonL;
	@FXML
	private Button buttonG;
	@FXML
	private Button buttonR;
	@FXML
	private ImageView imageL;
	@FXML
	private ImageView imageG;
	@FXML
	private ImageView imageR;
	@FXML
	private ImageView imageU;
	@FXML
	private Button buttonLogin;
	
	//private ControllerHomePageLibri cHPL;
	
	@FXML
	private void getListaGiornali()
	{
		//stampa schermata giornali -> tabella;
	}
	@FXML
	private void getListaRiviste()
	{
		//stampa schermata riviste -> tabella;
	}
	@FXML
	private void getListaLibri() throws IOException
	{
		Stage stage;
		Parent root;
		stage=(Stage)buttonL.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		stage.setTitle("Benvenuto nella schermata del riepilogo dei libri");
		
		

		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        
	        stage.show();
		
	}
	@FXML
	private void login() {
		// specificare controller ogico
		
	}

}

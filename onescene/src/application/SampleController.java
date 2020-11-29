package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SampleController {
	protected Scene scene;
	protected BorderPane root;
	protected BorderPane otherRoot;
	protected Stage stage;


	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public BorderPane getRoot() {
		return root;
	}

	public void setRoot(BorderPane root) {
		this.root = root;
	}

	public BorderPane getOtherRoot() {
		return otherRoot;
	}

	public void setOtherRoot(BorderPane otherRoot) {
		this.otherRoot = otherRoot;
	}
	
	
    public void changeScene(Event event, String nameOfFxml) throws IOException {
        Node node=(Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource(nameOfFxml));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("OtherSceneToSample");
    }
	
	 @FXML
	    public void alternativeChangeToOther(ActionEvent event) throws IOException {
	        changeScene(event,"Other.fxml");
	    }

	    @FXML
	    public void OtherSceneToSample(ActionEvent event) throws IOException {
	        changeScene(event,"sample.fxml");
	    }
	    




	
}

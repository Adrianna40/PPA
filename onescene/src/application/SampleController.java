package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
	@FXML public void alternativeChange(ActionEvent event) {
		this.scene.setRoot(otherRoot);
		this.setOtherRoot(root);
		this.setRoot(otherRoot);
		this.stage.setScene(this.getScene());
		this.stage.show();
		
		
	}

	
}

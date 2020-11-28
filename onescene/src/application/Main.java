package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader sceneLoader = new FXMLLoader(getClass().getResource("Sample.fxml"));
			FXMLLoader sceneLoader2 = new FXMLLoader(getClass().getResource("Other.fxml"));
			BorderPane root = (BorderPane)sceneLoader.load();
			BorderPane root2 = (BorderPane)sceneLoader2.load();
			
			SampleController controller = sceneLoader.getController();
			controller.setRoot(root);
			controller.setOtherRoot(root2);
			controller.setStage(primaryStage);
			Scene firstScene = new Scene(controller.root,400,400);
			controller.setScene(firstScene);
			firstScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(controller.getScene());
			primaryStage.show();
				
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

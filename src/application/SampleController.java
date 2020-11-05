package application;

import javafx.fxml.FXML;


import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.event.Event;




public class SampleController {

	@FXML TextArea textArea;
	@FXML ImageView MyPhoto;

	@FXML public void about(ActionEvent event) {
		textArea.textProperty().set("you've clicked on about");
	}

	@FXML public void hello(ActionEvent event) {
		textArea.setText("Helllo!");
		
		
	}

	@FXML public void changeFont(Event event) {
		javafx.scene.text.Font tr = new Font("TimesRoman", 18);
		textArea.fontProperty().set(tr);
	}

	@FXML public void changeFont2(Event event) {
		javafx.scene.text.Font tr = new Font("American Typewriter", 18);
		textArea.fontProperty().set(tr);
	}






	
}

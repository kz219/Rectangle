import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Choices extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Account Type");

		Label unameLabel = new Label("Username");
		Label pwLabel = new Label("Password");
		Label accLabel = new Label("Select your account type");

		TextField unameTxtField = new TextField();
		PasswordField pwTxtField = new PasswordField();

		ObservableList<String> options = FXCollections.observableArrayList("Administrator", "Staff", "Faculty", "Student");
		ComboBox acTypeComboBox = new ComboBox(options);

		Button signInButton = new Button("Sign In");
		signInButton.setOnAction(e-> {
			String displayStr = "";
			Font welcomeFont = new Font("Wingdings", 40);

		if(unameTxtField.getText().equals("csc200") && pwTxtField.getText().equals("123")) {
			String acType = (String)acTypeComboBox.getValue();
		if (acType.equals("Student")) {
			displayStr = "Welcome " + acType;
		} else {
			displayStr = "Incorrect Account Type!";
		}

		} else {
			displayStr = "Fail Authentication!";
		}
			Label welcomeLabel = new Label(displayStr);
			welcomeLabel.setFont(welcomeFont);
			Scene welcomeScene = new Scene(welcomeLabel);
			Stage welcomeStage = new Stage();
			welcomeStage.setScene(welcomeScene);
			welcomeStage.show();
		});

		VBox flowPane = new VBox();

		flowPane.getChildren().addAll(unameLabel,unameTxtField,pwLabel,pwTxtField,accLabel,acTypeComboBox,signInButton);
		Scene scene = new Scene(flowPane, 500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String [] args) {
		launch(args);
	}
}


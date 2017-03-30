import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AuthenticationJavaFx extends Application {
	private int attempt = 0;
	public enum AccountType {
		SelectAccount, Administrator, Student, staff, Guest
	}

	public static void main(String [] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		final int LIMIT = 3;
		Alert alert = new Alert(AlertType.INFORMATION);
		String correctUName = "kz219";
		String correctPw = "password";
		AccountType correctAcType = AccountType.Student;
		TextField usernameTxt = new TextField();
		usernameTxt.setText("username");
		PasswordField passwordField = new PasswordField();
		passwordField.setText("password");
		ComboBox <AccountType>comboBox = new ComboBox<>();
		comboBox.getItems().addAll(AccountType.SelectAccount, AcccountType.Administrator, AccountType.Student, AccountType.Staff, AccountType.Guest);
		comboBox.setValue(AccountType.SelectAccount);
		comboBox.setVisible(false);
		Button submitBtn = new Button("Login");
		submitBtn.setOnAction(e-> {
			if(usernameTxt.getText().equals(correctUName) && passwordField.getText().equals(correctPw) && attempt<=LIMIT) {
				comboBox.setVisible(true);
			} else if(attempt<LIMIT) {
				alert.setContentText("Invalid username/password");
				alert.showAndWait();
				attempt++;
			} else if(attempt>=LIMIT) {
				alert.setContentText("Contact Administrator");
				alert.showAndWait();
			}
		});

		comboBox.setOnAction(e-> {
			if(comboBox.getValue().equals(correctAcType)) {
				alert.setContentText("Welcome " + correctUName + "!");
				alert.showAndWait();
			} else if(!comboBox.getValue().equals(correctAcType)) {
				alert.setContentText("Wrong Account Type!, Select the account type again!");
				alert.showAndWait();
			}
		});

		VBox pane = new VBox();
		pane.getChildren().addAll(usernameTxt, passwordField, comboBox, submitBtn);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Authentication");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

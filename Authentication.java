import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Dialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.geometry.Insets;

public class Authentication extends Application {
	@Override
	public void start(Stage primarystage) {
		Dialog<Pair<String, String>> dialog = new Dialog<>();
		dialog.setTitle("Login");
		dialog.setHeaderText("Please enter your username and password");
		dialog.setGraphic(new ImageView(this.getClass().getResource("login.png").toString()));
		ButtonType loginButtonType = new ButtonType("Login", ButtonData.OK_DONE);
		dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20,150,10,10));

		TextField username = new TextField();
		username.setPromptText("Username:");
		PasswordField password = new PasswordField();
		password.setPromptText("Password:");

		grid.add(new Label("Username:"), 0, 0);
		grid.add(username,1,0);
		grid.add(new Label("Password:"), 0, 1);
		grid.add(password, 1, 1);

		dialog.getDialogPane().setContent(grid);

		Optional<Pair<String,String>> input = dialog.showAndWait();
		System.out.println(input.get());


	}
}

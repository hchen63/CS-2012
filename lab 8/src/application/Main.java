package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Random;

public class Main extends Application {

	Button bt;
	Label title;
	Label label;
	Label start;
	Label exit;
	GridPane grid;
	int row;
	int col;
	Player p = new Player();
	PastureMap map = new PastureMap(p);
	Cow cow = new Cow();

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Stroll in the Pasture");

			makeMap(primaryStage);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public HBox addTopHBox() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(10);
		hbox.setStyle("-fx-background-color: #7c7c7c;");

		Label title = new Label("Traverse The Back 40");
		title.getStyleClass().add("label");
		title.setFont(Font.font("Arial", FontWeight.BOLD, 16));
		title.setAlignment(Pos.CENTER);

		hbox.getChildren().add(title);

		return hbox;
	}

	public HBox addBotHBox(Stage primaryStage) {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(10);

		Button bt = new Button();
		bt.setText("run");
		bt.getStyleClass().add("button");
		bt.setFont(Font.font("Arial", FontWeight.BOLD, 16));
		bt.setAlignment(Pos.CENTER);
		bt.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				makeMap(primaryStage);
			}
		});
		hbox.getChildren().add(bt);

		return hbox;
	}

	public void makeMap(Stage primaryStage) {
		BorderPane border = new BorderPane();
		border.setTop(addTopHBox());
		border.setCenter(map.grid());
		
		border.setBottom(addBotHBox(primaryStage));

		Scene scene = new Scene(border, 750, 750);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();

		scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> {
			p.move(map, e);
			map.update();
		});
	}

}
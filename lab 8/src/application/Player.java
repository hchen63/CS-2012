package application;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Player extends Coordinate {

	Label label = new Label();
	Scene scene;
	int row = 1;
	int col = 1;
	String text = "  P  ";
	String Style = "-fx-background-color: #0000ff;";
	ArrayList<Cow> fences;

	public Player() {
		PastureMap map = new PastureMap();
//		System.out.println(super.getRow() + " " + super.getCol());
		super.setLetter('P');
		label.setText(text);
		label.setStyle(Style);
//		System.out.println(fences);
	}

	public void move(PastureMap map, KeyEvent e) {

		if (e.getCode().equals(KeyCode.UP)) {
			if (row > 1) {
				row--;
				label.getStyleClass().clear();
				label.setText("  P  ");
				label.setStyle("-fx-background-color: #0000ff;");
			}
		}
		if (e.getCode().equals(KeyCode.DOWN)) {
			if (row < 24) {
				row++;
				label.getStyleClass().clear();
				label.setText("  P  ");
				label.setStyle("-fx-background-color: #0000ff;");
			}
		}
		if (e.getCode().equals(KeyCode.LEFT)) {
			if (col > 1) {
				col--;
				label.getStyleClass().clear();
				label.setText("  P  ");
				label.setStyle("-fx-background-color: #0000ff;");
			}
		}
		if (e.getCode().equals(KeyCode.RIGHT)) {
			if (col < 24) {
				col++;
				label.getStyleClass().clear();
				label.setText("  P  ");
				label.setStyle("-fx-background-color: #0000ff;");
			}
		}
	}

}

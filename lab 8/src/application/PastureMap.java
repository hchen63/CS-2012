package application;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class PastureMap extends Coordinate {

	Label label;
	Player p;
	GridPane grid;
	ArrayList<Cow> cows = new ArrayList<Cow>();
	ArrayList<Cow> fences = new ArrayList<Cow>();
	// ArrayList<Cow> F = new ArrayList<Cow>(fences);

	public PastureMap(Player p) {
		this.p = p;
	}

	public PastureMap() {

	}

	public PastureMap(GridPane grid) {

	}

	public Node grid() {
		GridPane grid = new GridPane();
		this.grid = grid;
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(3);
		grid.setHgap(3);
		PastureMap map = new PastureMap();
		// Grids for grass and signs
		for (int row = 1; row < 25; row++) {
			for (int col = 1; col < 25; col++) {
				Label label = new Label();
				double num = 0 + (Math.random() * ((1 - 0) + 1));
				if (num > 0.15) {
					label.setText("      ");
					label.setStyle("-fx-background-color: #83ef8c;");
					// super.setLetter(' ');

				} else {
					label.setText("  F  ");
					label.setStyle("-fx-background-color: #ccae72;");
					Cow c = new Cow(row, col, map);
					super.setLetter('F');

					fences.add(c);

				}
				grid.add(label, col, row);
			}
		}

		// Grids for edges
		for (int row = 0; row < 25; row++) {
			for (int col = 0; col < 25; col++) {
				Label label = new Label();
				label.setText("  F  ");
				label.setStyle("-fx-background-color: #ccae72;");
				Cow c = new Cow(row, 25, map);
				fences.add(c);
				grid.add(label, row, 25);

			}
			Label label = new Label();
			label.setText("  F  ");
			label.setStyle("-fx-background-color: #ccae72;");
			Cow c = new Cow(row, 0, map);
			fences.add(c);
			grid.add(label, row, 0);
		}

		// Grids for edges 2
		for (int col = 0; col <= 25; col++) {
			for (int row = 0; row < 25; row++) {
				Label label = new Label();
				label.setText("  F  ");
				label.setStyle("-fx-background-color: #ccae72;");
				Cow c = new Cow(0, col, map);
				fences.add(c);
				grid.add(label, 0, col);
			}
			Label label = new Label();
			label.setText("  F  ");
			label.setStyle("-fx-background-color: #ccae72;");
			Cow c = new Cow(25, col, map);
			fences.add(c);
			grid.add(label, 25, col);
		}

		// Create cows
		for (int num = 1; num <= 4; num++) {
			int row = (int) ((Math.random() * ((23 - 3) + 3)));
			int col = (int) ((Math.random() * ((23 - 2) + 2)));
			Cow cow = new Cow(row, col, map);

			grid.add(cow.label, col, row);
			cows.add(cow);
//			cow.test();
		}

		Label start = new Label();
		start.setText("  S  ");
		start.setStyle("-fx-background-color: #000000;");

		grid.add(start, 1, 0);

		Label exit = new Label();
		exit.setText("  E  ");
		exit.setStyle("-fx-background-color: #000000;");

		grid.add(p.label, 1, 1);

		grid.add(exit, 24, 25);
		return grid;

	}

	public void update() {
		grid.getChildren().remove(p.label);
		grid.add(p.label, p.col, p.row);

		for (int i = 0; i < cows.size(); i++) {
			cows.get(i).move();
			grid.getChildren().remove(cows.get(i).label);
			grid.add(cows.get(i).label, cows.get(i).col, cows.get(i).row);
		}

		for (int i = 0; i < cows.size(); i++) {
			if (p.row == cows.get(i).row && p.col == cows.get(i).col) {
				System.out.println("you lose");
				System.exit(0);
			}
		}

		for (int i = 0; i < fences.size(); i++) {
			if (p.row == fences.get(i).row && p.col == fences.get(i).col) {
				grid.getChildren().remove(p.label);
				grid.add(p.label, p.col, p.row);
				System.out.println("Your on a fence. Stop it.");
			}
		}

		if (p.row == 24 && p.col == 24) {
			System.out.println("you win");
			System.exit(0);
		}

	}

	/*
	 * label.setOnMouseClicked(new EventHandler<MouseEvent>(){ public void
	 * handle(MouseEvent mouseE) { Coordinate coord = new Coordinate();
	 * if(label.getText().equals( "      ")) { label.setText("  F  ");
	 * label.setStyle("-fx-background-color: #ccae72;"); int col = coord.getCol();
	 * int row = coord.getRow(); grid.add(label, row, col); }
	 * if(label.getText().equals("  F  ")) { label.setText("      ");
	 * label.setStyle("-fx-background-color: #83ef8c;"); int col = coord.getCol();
	 * int row = coord.getRow(); grid.add(label, row, col); } } } );
	 */ }

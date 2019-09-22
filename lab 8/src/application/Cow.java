
package application;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

import java.util.Random;

public class Cow extends Coordinate {

	Label label = new Label();
	Scene scene;
	int row;
	int col;
	String text = "  C  ";
	String Style = "-fx-background-color: #FFFFFF;";
	PastureMap map;
	GridPane grid;

	public Cow() {
		super();
		label.setText(text);
		label.setStyle(Style);
		super.setRow(row);
		super.setCol(col);
		super.setLetter('c');

	}

	public Cow(int row, int col, PastureMap map) {
		super();
		label.setText(text);
		label.setStyle(Style);
		this.row = row;
		this.col = col;
		super.setRow(row);
		super.setCol(col);
		super.setLetter('c');
		this.map = map;

	}

/*	public void test() {
		System.out.println(super.getRow() + " " + super.getCol() + super.getLetter());
	}
*/	
	public void move() {
		for (int x = 0; x < 2; x++) {
			int num = (int) ((Math.random() * ((5 - 1) + 1)));
//			System.out.print(num);

			if (num == 1) {
				Label mud = new Label();
				mud.setText("      ");
				mud.setStyle("-fx-background-color: #A0522D;");

				if (super.getLetter() != 'F' && row > 1) {
					row--;
					label.getStyleClass().clear();
					label.setText("  C  ");
					label.setStyle("-fx-background-color: #FFFFFF;");
//					System.out.println(" did1 " + row + " " + col);
				}
			}
			if (num == 2) {
//				map.grid.add(mud, col, row);
				if (super.getLetter() != 'F' && row < 24) {
					for(int i=0; i < 1; i++) {
						row--;
						label.setText("      ");
						label.setStyle("-fx-background-color: #A0522D;");
					}
					row++;
					label.getStyleClass().clear();
					label.setText("  C  ");
					label.setStyle("-fx-background-color: #FFFFFF;");
//					System.out.println(" did 2");
					
				}
				
			}
			if (num == 3) {
//				map.grid.add(mud, col, row);
				if (super.getLetter() != 'F' && col > 1) {
					col--;
					label.getStyleClass().clear();
					label.setText("  C  ");
					label.setStyle("-fx-background-color: #FFFFFF;");
//					System.out.println(" did3 ");
				}
			}
			if (num == 4) {
//				map.grid.add(mud, col, row);
				if (super.getLetter() != 'F' && col < 24) {
					col++;
					label.getStyleClass().clear();
					label.setText("  C  ");
					label.setStyle("-fx-background-color: #FFFFFF;");
//					System.out.println(" did4 ");
				}
			}
		}
//		test();
	}
}

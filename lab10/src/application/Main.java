/*
Create a new version of your Monster Attack lab, but add binary file I/O and a JavaFX GUI to take the input and provide output.

Use an interface called MonsterPersister that includes a method to save a list of MonsterAttacks to a file 
and one to read a list of MonsterAttacks from a file and return the list.
Implement the interface with the class BinaryMonsterPersister, which uses binary file I/O.
Implement the interface again with the class TextMonsterPersister, which uses the text file I/O method you already created.
Let the user choose at runtime whether to use binary or text I/O. Use a BinaryMonsterPersister or a TextMonsterPersister, according to the choice the user makes.
Use JavaFX for the GUI. You may choose to use either all-Java coding or FXML for the UI, but do not copy any of my lecture examples.
*/
package application;
	
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	TextMonsterPersister monAtt = new TextMonsterPersister();
	private ArrayList<String> monsterAttackList;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Lab 10");
			
			Scanner in = new Scanner(System.in);
			ArrayList<String> monsterAttackList = new ArrayList<String>(100);
//			AttackMonitor mon = new AttackMonitor();
//			TextMonsterPersister monAtt = new TextMonsterPersister();
			
			BorderPane border = new BorderPane();
			
			Button add = new Button("Add Monster Attack");
			add.setOnAction(event -> {
	            monAtt.addAttack();
	        });
			Button delete = new Button("Delete Monster Attack");
			delete.setOnAction(event -> {
	            monAtt.delete(in, monsterAttackList);
	        });
			Button display = new Button("Display Monster Attack");
			display.setOnAction(event -> {
	            monAtt.display();
	        });
			Button save = new Button("Save Monster Attack");
			save.setOnAction(event -> {
	            monAtt.save(monsterAttackList, in);
	        });
			Button clear = new Button("Clear Monster Attack");
			clear.setOnAction(event -> {
	            monAtt.clears(monsterAttackList, in);
	        });
			Button exit = new Button("Exit");
			exit.setOnAction(event -> {
		            System.exit(0);
		        });
			
			Button file = new Button("File");
			file.setOnAction(event -> {
				MonsterPersister mPer = new MonsterPersister();
				mPer.file();
	        });
		
			VBox vbox = new VBox();
		    vbox.setPadding(new Insets(15, 12, 15, 12));
		    vbox.setSpacing(10);
			vbox.getChildren().addAll(add, delete, display, save, clear, exit);
			
			border.setLeft(file);
			border.setCenter(vbox);
			
			Scene scene = new Scene(border,300,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

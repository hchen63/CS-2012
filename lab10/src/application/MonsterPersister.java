package application;

import java.io.File;
import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MonsterPersister {
	File f;
	ArrayList<String> monsterAttackList;
	TextField fileName;
	
	public void file() {
		Stage fileStage = new Stage();
		fileStage.setTitle("File");
		BinaryMonsterPersister bin = new BinaryMonsterPersister();
		
/*		Button open = new Button("Open a Binary File");
		open.setOnAction(event -> {
            try {
				bin.open(f, monsterAttackList);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });
*/		TextField fileName = new TextField ("Enter File Name");
//		fileName.getText();
		Button save = new Button("Save a Binary File");
		save.setOnAction(event -> {			
            bin.save(monsterAttackList, fileName);
        });
		Button exit = new Button("Exit");
		exit.setOnAction(event -> {
	            System.exit(0);
	        });
		VBox fileVBox = new VBox();
		fileVBox.setPadding(new Insets(15, 12, 15, 12));
		fileVBox.setSpacing(10);
		
		fileVBox.getChildren().addAll(fileName, save, exit);
		fileStage.setTitle("My New Stage Title");
		Scene addScene = new Scene(fileVBox, 250, 150);
		fileStage.setScene(addScene);
		fileStage.show();
	}

}

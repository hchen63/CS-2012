package application;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.control.TextField;

public class BinaryMonsterPersister {
	private ArrayList<String> monsterAttackList;
	TextField fileName;
	
	 public void save(ArrayList<String> monsterAttackList, TextField fileName) {
	       try {
	    	   File f = new File(fileName.getText());
	    	   FileOutputStream fileOS = new FileOutputStream(f);
	    	   ObjectOutputStream oOS = new ObjectOutputStream(fileOS);
	           oOS.writeObject(monsterAttackList);
	           oOS.close();
	       } catch (FileNotFoundException e) {
	           e.printStackTrace();
	       }catch (IOException ex) {
			    ex.printStackTrace();
			}
	 }
}

package Utilities;

import java.io.*;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		OutputStream writeFile = null;
		try {
			File file = new File("config.properties");
			System.out.println("Archivo se guardará en: " + file.getAbsolutePath());
			writeFile = new FileOutputStream(file);
			prop.setProperty("DBServer", "julian777");
			prop.setProperty("DBName", "db_patino");
			prop.setProperty("DBPass", "testpassword");
			prop.setProperty("UserName", "root");
			prop.store(writeFile, null); //Guarda las propiedades en archivo de salida
			
			System.out.println("Create Properties Successfully.");	
			 			
		}catch(IOException io) {
			io.printStackTrace();
		} finally {
			if(writeFile != null) {
				try {
					writeFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
		}
	}
}

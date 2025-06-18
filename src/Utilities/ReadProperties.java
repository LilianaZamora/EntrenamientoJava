package Utilities;

import java.io.*;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		InputStream readFile = null;
		try {
			File file = new File("config.properties");
			System.out.println("Archivo se guardará en: " + file.getAbsolutePath());
			readFile = new FileInputStream(file);	
			prop.load(readFile); //Se cargan las propiedades desde el archivo hacia el objeto prop
			System.out.println(prop.getProperty("DBServer")); //Se recuperán y muestran las propiedades específicas por su clave
			System.out.println(prop.getProperty("DBName"));
			System.out.println(prop.getProperty("DBPass"));
			System.out.println(prop.getProperty("UserName"));					 			
		}catch(IOException io) {
			System.out.println("An error occurred while reading the file.");		
			io.printStackTrace();
		} finally {
			if(readFile != null) {
				try {
					readFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
		}
	}
}

package Utilities;

import java.io.*;
import org.json.simple.*;

public class WriteJsonFile {
	
	@SuppressWarnings("unchecked")

	public static void main(String[] args) {
		
		//----------Estudiante # 1----------
		JSONObject estudiante1 = new JSONObject();
		estudiante1.put("nombreEstudiante", "María Gaia");
		estudiante1.put("grado", "Tercero");
		estudiante1.put("ubicación", "Bogotá");
		
		//----------Estudiante # 2----------
		JSONObject estudiante2 = new JSONObject();
		estudiante2.put("nombreEstudiante", "Ango Lorenzo");
		estudiante2.put("grado", "Quinto");
		estudiante2.put("ubicación", "Bogotá");
		
		//----------Estudiante # 3----------
		JSONObject estudiante3 = new JSONObject();
		estudiante3.put("nombreEstudiante", "Liliana");
		estudiante3.put("grado", "Sexto");
		estudiante3.put("ubicación", "Manizales");
		
		//Arreglo de Estudiantes
		JSONArray detallesEstudiantes = new JSONArray();
		detallesEstudiantes.add(estudiante1);
		detallesEstudiantes.add(estudiante2);
		detallesEstudiantes.add(estudiante3);
		
		//Objeto contenedor principal
		JSONObject datos = new JSONObject();
		datos.put("detallesEstudiantes", detallesEstudiantes);
		
		System.out.println(datos.toJSONString());
		
		try(FileWriter archivo = new FileWriter("estudiantes.json")){
			archivo.write(datos.toJSONString()); //Escribe el contenido JSON como texto
			archivo.flush(); //Fuerza la escritura inmediata de los datos en el disco
			System.out.println("JSON file saved successfully");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

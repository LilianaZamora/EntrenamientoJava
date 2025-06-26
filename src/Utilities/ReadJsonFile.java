package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {
	
	@SuppressWarnings("unchecked")

	public static void main(String[] args) throws IOException, ParseException{
		
		String filepath = System.getProperty("user.dir") + "//testData.json"; //Se obtiene la ruta absoluta del directorio actual		
		FileReader file = new FileReader(filepath); //Abre el archivo JSON ubicado en la ruts especifica
		JSONParser parser = new JSONParser(); //Crea una instancia de la clase parser que se usa para convertir el texto el archivo		
		JSONObject json = (JSONObject) parser.parse(file); //Parsea el contenido del archivo y lo convierte en un objeto JSON principal
		System.out.println(json.toJSONString()); //Muestra el contenido completo del archivo JSON en forma de texto		
		JSONArray testData = (JSONArray) json.get("testdata"); //Extrae del objeto JSON el arreglo que está bajo la clave "testdata". Este arreglo contiene uno o más casos de prueba.
		
		for (int i = 0; i < testData.size(); i++) { //Itera sobre cada elemento del arreglo "testdata"
			
			JSONObject testCase = (JSONObject) testData.get(i); //Extrae un objeto individual que representa un caso de prueba. 
			System.out.println("El nombre del caso de prueba es: -- " + testCase.get("testName")); //Imprime el nombre del caso de prueba					
			JSONArray testCaseData = (JSONArray) testCase.get("data"); //Extrae del arreglo de datos que esta bnajo la clave "data" dentro del caso de prueba
			
			for (int j = 0; j < testCaseData.size(); j++) { //Itera sobre cada elemento dentro del arreglo data
				
				JSONObject currentTestData = (JSONObject) testCaseData.get(j); //Obtiene el objeto JSON actual				
				Set<String> keys = currentTestData.keySet(); //Obtiene un conjunto de claves del objeto actual				
				Iterator<String> it = keys.iterator(); //Crea un iterador para recorrer todas las claves del objeto				
				while (it.hasNext()) { //Mientras haya más claves por recorrer
					
					String key = it.next(); //Obtiene la siguiente clave
					String value = (String) currentTestData.get(key); //Obtiene el valor correspondiente a la clave
					System.out.println(key + "--" + value); //Imprime el valor por cada uno
					
				}
				
			}			
			
		}		

	}

}

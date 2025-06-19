package Utilities;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class WriteExcelFile {

	public static void main(String[] args) {
		
		try(XSSFWorkbook workbook = new XSSFWorkbook()){
			XSSFSheet samplesheet = workbook.createSheet("SampleSheet");
			Map<String,Object[]> dataSet = new TreeMap<String,Object[]>(); //Se define un conjunto de datos usando TreeMap
			dataSet.put("1", new Object[] {"ID", "NAME", "CITY"}); //Se agrega los datos al mapa, cada fila es un arreglo de objetos
			dataSet.put("2", new Object[] {"1", "Maria GaiAngel", "Bogotá"});
			dataSet.put("3", new Object[] {"2", "Ango Lorenzo", "Bogotá"});
			dataSet.put("4", new Object[] {"3", "Liliana Zamora", "Manizales"});
			dataSet.put("5", new Object[] {"4", "Elias Zamora", "Mariquita"});
			dataSet.put("6", new Object[] {"5", "Ofelia Rodríguez", "Guaduas"});
			dataSet.put("7", new Object[] {"6", "Galadriel Zamora", "Chía"});
			dataSet.put("8", new Object[] {"7", "Wilman Zamora", "Lérida"});
			
			Set<String> set = dataSet.keySet(); //Se obtiene el conjunto de claves del mapa
			int rownums = 0; //Contador de filas
			for(String key : set) { //Se itera sobre cada fila de datos
				Row row = samplesheet.createRow(rownums++); //Se crea una nueva fila en la hoja
				Object[]data = dataSet.get(key); //Se obtiene los datos correspondientes a la fila
				int cellNum = 0; //Contador de celdas
					for (Object value : data) { //Se itera sobre los valores de la fila para crear celdas
						Cell cell = row.createCell(cellNum++); //Se crea una nueva celda
						if (value instanceof String)//Se  verifica el tipo de dato y se asigna el valor de la celda
							cell.setCellValue((String)value);
						else if (value instanceof Integer)
							cell.setCellValue((Integer)value);
					}
			}	
			
			try {
				FileOutputStream writeFile = new FileOutputStream("sampleTest.xlsx"); //Se escribe el archivo Excel en el disco duro
				workbook.write(writeFile); //Se escribe el contenido del worbook en el archivo
				writeFile.close(); //Se cierra el flujo del archivo
				System.out.println("Create File Successfully.");	
			}catch(FileNotFoundException e) { //Manejo de error si el archivo no se puede crear o encontrar
				e.printStackTrace();
			}catch(IOException e) { //Manejo de entrada o salida general
				e.printStackTrace();
			}
		}catch(IOException e) {
			e.printStackTrace(); //Manejo de error si el workbook no puede ser creado o cerrado
		}

	}

}

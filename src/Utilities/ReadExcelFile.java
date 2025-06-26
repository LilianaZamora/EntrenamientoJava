package Utilities;

import java.io.*;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


public class ReadExcelFile {

	public static void main(String[] args) {
		try (FileInputStream readFile = new FileInputStream("sampleTest.xlsx");
		     XSSFWorkbook workbook = new XSSFWorkbook(readFile)) { // Abre el archivo y el libro
			XSSFSheet sheet = workbook.getSheet("SampleSheet");
			Row row;
			Cell cell;

			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					cell = cellIterator.next();
					DataFormatter formatter = new DataFormatter();
					String text = formatter.formatCellValue(cell);
					System.out.println(text);
				}
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}
}
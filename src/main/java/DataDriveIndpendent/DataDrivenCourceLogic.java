package DataDriveIndpendent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenCourceLogic {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Codes Orbit\\eclipse-workspace\\MySeleniumCourcePractice\\XLXS\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {
			String sheetName = workbook.getSheetName(i);
			System.out.println("Sheet Name: " + sheetName);

			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Iterate through rows

				Iterator<Row> rowIterator = sheet.iterator();
				Row firstrow = rowIterator.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int k=0;
				int column=0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Email")) {
						
						//Desire column
						column=k;
					}
					k++;
					
				}
				System.out.println(column);
				
				while (rowIterator.hasNext()) {
					Row r = rowIterator.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Noble Rogahn")) {
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							System.out.println(cv.next().getStringCellValue());
						}
						
					}
				}

			}
		}

//        for (int i = 0; i < sheets; i++) {
//            if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
//                XSSFSheet sheet = workbook.getSheetAt(i);
//
//                // Iterate through rows
//                for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
//                    XSSFRow row = sheet.getRow(rowIndex);
//
//                    // Iterate through cells in the row
//                    for (int cellIndex = 0; cellIndex < row.getLastCellNum(); cellIndex++) {
//                        XSSFCell cell = row.getCell(cellIndex);
//                        System.out.print(cell.toString() + "\t"); // Print cell value to console
//                    }
//                    System.out.println(); // Move to the next line after each row
//                }
//            }
//        }

		// Close resources
		workbook.close();
		fis.close();
	}
}

package base;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.Iterator;

//Identify Test cases column by scanning the entire 1st row
//Once column is identified then scan entire test case column to identify purchase test case row
//After you grab purchase test case row -> pull all the data of that row and feed into test

public class ExcelSheet {
	public ArrayList<String> getData(String testCasename) throws IOException {
		ArrayList<String> a = new ArrayList<String>();

		// Create a FileInputStream to read the Excel file
		FileInputStream fis = new FileInputStream("D:\\testdata.xlsx");

		// Create a workbook object to represent the Excel workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Get the number of sheets in the workbook and print
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("Total number of sheets: " + sheetCount);

		// Iterate through each sheet in the workbook
		for (int i = 0; i < sheetCount; i++) {
			// Check if the current sheet's name matches "Sheet1"
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				// Get the XSSFSheet object representing the current sheet
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Get an iterator over the rows in the sheet
				Iterator<Row> rows = sheet.iterator();

				// Find the column index for "TestCases"
				Row firstRow = rows.next(); // Get the first row
				Iterator<Cell> ce = firstRow.cellIterator(); // Get an iterator over the cells in the first row
				int column = 0; // Initialize the column index to 0
				int k = 0; // Initialize a counter for the cell index
				while (ce.hasNext()) {
					Cell value = ce.next(); // Get the next cell
					// Check if the cell value matches "TestCases"
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k; // Store the column index
						break; // Exit the loop
					}
					k++; // Increment the counter
				}

				// Print the column index for "TestCases"
				System.out.println("Column index for 'TestCases': " + column);

				// Iterate through rows to find the row with the specified test case name
				while (rows.hasNext()) {
					Row r = rows.next(); // Get the next row
					// Check if the cell in the "TestCases" column matches the specified test case
					// name
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCasename)) {
						// Print values in the row
						Iterator<Cell> cv = r.cellIterator(); // Get an iterator over the cells in the row
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellType() == CellType.STRING) {
								// If the cell contains a string value, add it to the ArrayList
								a.add(c.getStringCellValue());
							} else {
								// If the cell contains a numeric value, convert it to string and add it to the
								// ArrayList
								a.add(String.valueOf(c.getNumericCellValue()));
							}
						}
					}
				}
			}
		}

		// Close the workbook and FileInputStream to release resources
		workbook.close();
		fis.close();

		// Return the ArrayList containing the data
		return a;
	}
}

/*----Algorithms---*/
//Open the Excel file using a FileInputStream.
//Create a XSSFWorkbook object to represent the Excel workbook.
//Iterate through each sheet in the workbook.
//For each sheet, check if its name matches the desired sheet name (in this case, "Sheet1").
//If the sheet matches, obtain the XSSFSheet object representing that sheet.
//Get an iterator over the rows in the sheet.
//In the first row, find the column index for the column named "TestCases". This column contains the names of the test cases.
//Iterate through the rows to find the row that corresponds to the specified test case name.
//Once the row corresponding to the test case is found, iterate through its cells.
//For each cell, determine its type:
//If it's a string cell, add its string value to the ArrayList.
//If it's a numeric cell, convert its numeric value to a string and add it to the ArrayList.
//Continue this process until all rows have been processed.
//Close the workbook and FileInputStream to release resources.
//Return the ArrayList containing the data extracted from the Excel file.


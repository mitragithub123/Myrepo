package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

    public static Object[][] readExcelData(String excelPath) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(excelPath));
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0) != null ? sheet.getRow(0).getPhysicalNumberOfCells() : 0; // Handle empty first row

        Object[][] data = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                    data[i - 1][j] = cell.getCellType() == CellType.NUMERIC
                            ? String.valueOf((int) cell.getNumericCellValue())
                            : cell.getStringCellValue();
                } else {
                    // Handle empty cell (e.g., add an empty string to the data array)
                    data[i - 1][j] = "";
                }
            }
        }

        workbook.close();
        return data;
    }
}

package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPExcel {

    @DataProvider(name = "excelData", parallel = true)
    public Object[][] excelDataProvider() {
        return getExcelData("/Users/sevvelkaranpalanivetrivel/Desktop/TestData.xlsx", "Sheet1");
    }

    public String[][] getExcelData(String filePath, String sheetName) {
        String[][] data = null;
        try (FileInputStream fis = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new RuntimeException("Sheet " + sheetName + " not found in " + filePath);
            }

            int numRows = sheet.getPhysicalNumberOfRows();
            int numCols = sheet.getRow(0).getLastCellNum();
            data = new String[numRows-1][numCols];

            for (int i = 1; i < numRows; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    for (int j = 0; j < numCols; j++) {
                        Cell cell = row.getCell(j);
                        data[i - 1][j] = (cell == null) ? "" : cell.toString();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

package Utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileRead {
    public static void main(String[] args) throws IOException {
      String Filepath= "/home/lentraadmin/Desktop/AniketDesk/25 data set.xlsx";
        FileInputStream input = new FileInputStream(Filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheet("Refined");
        XSSFRow row = sheet.getRow(1);
       // XSSFCell cell = row.getCell(0);

        System.out.println(row.getCell(3));// directly defining the cell number in print statement
    }


}

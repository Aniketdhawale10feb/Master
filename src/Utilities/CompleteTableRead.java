package Utilities;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;

public class CompleteTableRead {
    public static void main(String[] args) throws IOException {
        String Path = "/home/lentraadmin/Desktop/AniketDesk/25 data set.xlsx";
        FileInputStream input = new FileInputStream(Path);
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheet("Refined");

        for (int r=0 ; r<sheet.getLastRowNum();r++)
        {
            XSSFRow row= sheet.getRow(r);
            for (int c=0;c<row.getLastCellNum();c++)
            {
                System.out.print(row.getCell(c));
                System.out.print(" | ");
            }
            System.out.println(" ");
        }
    }
}

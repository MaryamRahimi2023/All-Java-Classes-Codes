package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {

        String path="Files/TestTask.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");

        int rowSize=sheet1.getPhysicalNumberOfRows(); // this method gives us the total number of rows in our sheet1
        for (int i = 0; i < rowSize; i++) {
            Row row=sheet1.getRow(i);// gives us all the row from 0-4

            int numOfCells=row.getPhysicalNumberOfCells();// this method gives us the total number of cells in our sheet1
            for (int j = 0; j < numOfCells ; j++) {
                Cell cell=row.getCell(j);// gives us all columns from 0-4 in each row
                System.out.print(cell+" ");
            }
            System.out.println();

        }
    }
}

package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelIssues {

    public static void main(String[] args) throws IOException {

        String path="Files/TestTask.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);// we pass the path which we saved in fileInputStream in here to read it
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");// if I change the sheet data I need to save it first then it will come to my program here
        Row row=sheet1.getRow(1);// rows that reads in Excel like this direction ------->
        Cell cell=row.getCell(0);
        System.out.println(cell);// Hamid
        Row row1=sheet1.getRow(2);
        Cell cell1=row1.getCell(0);
        System.out.println(cell1);// Sam
        Row row2=sheet1.getRow(3);
        Cell cell3=row2.getCell(0);
        System.out.println(cell3);// Fayed

    }
}

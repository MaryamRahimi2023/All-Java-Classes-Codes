package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestTask {

    public static void main(String[] args) throws IOException {


        String path="Files/TestTask.xlsx";// the class name can be different

       // to read data = input, to write = output

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream); // creating the object of this class to read and write the Excel files

        // we have saved all the data from the Excel file to the xssfWorkbook
        // from the Excel file we need to get the sheet first using below method
        XSSFSheet sheet1= xssfWorkbook.getSheet("Sheet1");

        /* as we are interested in the row 1 we pass 1 inside the getrow method
        * rows and columns are indexed just like arrays */

        Row row=sheet1.getRow(1);
        Cell cell=row.getCell(1);

        // All numbers are treated as double in Excel
        System.out.println(cell);// 30.0


    }
}

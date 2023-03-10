package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelReaderDemo4 {

    public static void main(String[] args) throws IOException {

            String path="Files/TestTask.xlsx";
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");

            int rowSize=sheet1.getPhysicalNumberOfRows(); // this method gives us the total number of rows in our sheet1

        List<Map<String,String>> excelData=new ArrayList<>();

            for (int i = 1; i < rowSize; i++) {// we start one coz first row is written us keys
                Row row = sheet1.getRow(i);// gives us all the row from 0-4

                LinkedHashMap rowMap=new LinkedHashMap();
                rowMap.put("Name",row.getCell(0));
                rowMap.put("Age",row.getCell(1));
                rowMap.put("City",row.getCell(2));
                rowMap.put("salary",row.getCell(3));

                excelData.add(rowMap);

            }
        System.out.println(excelData);

            // [{Name=Hamid, Age=30.0, City=San Roman, salary=120000.0},
        // {Name=Sam, Age=60.0, City=Houston, salary=125000.0},
        // {Name=Fayed, Age=45.0, City=Alexandria, salary=129000}]
        }
    }


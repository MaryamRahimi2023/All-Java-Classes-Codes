package class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo6 {

    public static void main(String[] args) throws IOException {

        String path="Files/TestTask.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet1");
        int numOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(numOfRows); // 7

      /*  for (int i = 0; i < numOfRows; i++) {
            Row row= sheet2.getRow(i);

            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                System.out.print(row.getCell(j)+" ");
                *//* Useraname Password
                    asghar@gmail.com 123SKBDSSD+_#_$
                    asghar@gmail 123SKBDSSD+_#_$
                    asghar@gmail. 123SKBDSSD+_#_$
                    asghargmail.com 123SKBDSSD+_#_$
                    asghargmail.com 123SKBDSSD
                    asghargmail.com 123SKBDSSD *//*
            }
            System.out.println();
        }*/

// we can achieve this with a list of map better

        /*List<Map<String,String>> excelData=new ArrayList<>();
        for (int i = 1; i < numOfRows; i++) {
            Row row = sheet2.getRow(i);
            LinkedHashMap rowMap = new LinkedHashMap();
            rowMap.put("Username", row.getCell(0).toString());
            rowMap.put("Password", row.getCell(1).toString());
            excelData.add(rowMap);
        }
        System.out.println(excelData);*/

//  we can get the same result by this code that automatically wil get the rows and cells which will work for any sheet with any numbers of data

        List<Map<String,String>> excelData=new ArrayList<>();

        Row row0=sheet2.getRow(0);
        for (int i = 1; i < numOfRows; i++) {
            Row row = sheet2.getRow(i);
            LinkedHashMap rowMap = new LinkedHashMap();
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                rowMap.put(row0.getCell(j).toString(),row.getCell(j).toString());
//                         This is the key             this is the value
            }
            excelData.add(rowMap);

            }
        System.out.println(excelData);


    }
}

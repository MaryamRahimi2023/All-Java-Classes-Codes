package class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo7 {

    public static void main(String[] args) throws IOException {

        List<Map<String,String>> excelData= ExcelReader.read();
       /* System.out.println(excelData);*/

       /* Map<String,String> firstRow=excelData.get(1);// it starts from Hamid which is 0
        System.out.println(firstRow.get("Salary"));

        Map<String,String> firstRow1=excelData.get(0);// it starts from Hamid which is 0
        System.out.println(firstRow1.get("Name"));

        System.out.println(firstRow);*/

        for (Map<String,String> row : excelData) {
            for (Map.Entry<String,String> entry : row.entrySet()) {
                System.out.print(entry.getKey()+" "+entry.getValue()+" ");
            }
            System.out.println();

        }


    }
}

package class29.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {

    /*
      3)Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
      Output should be in the below format
      John Smith=$100000 */

    public static void main(String[] args) {

        Map<String,Integer> employee=new HashMap<>();
        employee.put("Sophia Chen",30000);
        employee.put("Ethan Lee",35000);
        employee.put("Maya Patel",40000);
        employee.put("Lucas Kim",60000);
        employee.put("Olivia Brown",50000);

        // Set<Map.Entry<String,Integer>> entrySet=employee.entrySet();
        var entrySet= employee.entrySet();
        int maxSalary=0;
        String maxSalaryEmp="";
        for (var entry : entrySet) {
            if(entry.getValue()>maxSalary){
                maxSalary=entry.getValue();
               maxSalaryEmp=entry.getKey();
            }
            }
        System.out.println(maxSalaryEmp+"=$"+maxSalary);

        }


    }



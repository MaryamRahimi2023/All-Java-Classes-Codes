package class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {

    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Aisha"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);


    }


}

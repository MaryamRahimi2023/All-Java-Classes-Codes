package class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");

        // remove all keys greater than 2 and values which contains the letter i

        Set<Entry<Integer,String>> entrySet=studentsMap.entrySet();// this will give us a set that gives us Integer and String
        for (Entry<Integer,String> entry:entrySet) {
            //System.out.println(entry.getValue());
           // System.out.println(entry.getKey());
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        entrySet.removeIf(x->x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(studentsMap);// [1=Nezir, 2=Shah, 5=Gul, 6=Bahar, 7=Saba]


        }

    }


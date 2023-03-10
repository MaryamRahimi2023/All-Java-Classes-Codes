import java.util.ArrayList;
import java.util.LinkedList;

public class test {

    public static void main(String[] args) {

        LinkedList<Integer> number=new LinkedList<>();

        ArrayList<String> a=new ArrayList<>();

        for (int i=1; i<7; i++){
            a.add(i+""+i+i);
        }

        for (int i=0; i<5; i+=2){
            System.out.println(a.get(i));
        }

        ArrayList <Integer> b=new ArrayList<>();

        for (int i=111; i<667; i+=111){
            b.add(i);
        }

        for (int i=0; i<5; i+=2){
            System.out.println(b.get(i));
        }




    }
}

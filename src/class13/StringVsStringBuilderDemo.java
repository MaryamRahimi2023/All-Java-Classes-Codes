package class13;

public class StringVsStringBuilderDemo {

    public static void main(String[] args) {

    String str="";
        for (int i = 0; i < 1000; i++) {// every iteration of this loop a scan of memory will happen
            str=str+i;
        }

        StringBuilder str1= new StringBuilder();
        for (int i = 0; i < 1000; i++) {// we change it to String builder to speed up the process
            str1.append(i);
        }
    }
}

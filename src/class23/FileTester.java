package class23;

public class FileTester {

    public static void main(String[] args) {

        // we can not create an object of abstract class

        File [] files={new javaFile(1024),new wordFile(25),new pDfFile(50) };

        for (int i = 0; i < files.length; i++) {
            File file=files[i];
            file.open();
            file.edit();
            file.close();

        }
    }
}

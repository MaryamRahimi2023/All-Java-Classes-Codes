package class23;


/* Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while
   open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
   Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft Word to be installed etc*/

public abstract class File {

    int size;
    File(int size){// we can use constructors in abstract as well
        this.size=size;// constructors main feature is to initialize the instance filed
    }

    abstract void open();// this called method header , method signature the method name and parameters
    // this is an abstract coz that we do not need any implementation
    public void edit(){
        System.out.println("editing the file");
    }

    public void close(){
        System.out.println("Closing the file");
    }
}

class javaFile extends File{// either this class should be abstract to or override the abstract method from parent class


    javaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");

    }

    @Override
    public void edit() {
        System.out.println("Java files are editable in intellij");
    }
}
class wordFile extends File{

    wordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");

    }

}
class pDfFile extends File{

    pDfFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in Acrobat reader");

    }
}

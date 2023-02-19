package class26;

public class Demo2 {

    public static void main(String[] args) {

        String name="Nima";
        String [] names={"Hiral","Nima","Laura","Nat"};


        // calling the method coz static and in the same class only call by name
        System.out.println(contains(name,names));
        // names[4]="Shah"; this is not possible to add another name to the array after it is created and run

        // 2 benefits of array list

        /* 1. All the below methods are already written in Array List in java, so we can easily call them
              these logics are present in Array list, we should learn how to call them
          2. Array list will give you the facility to save some memories if required if not will delete it
             we can define the size or not if define will work better if not will do itself but will be a little slow then Array

             Array are way faster and give is a good memory save than Array list which are slower and more memory use
             Array list will not work with permitive data types
             Arraylist will use more memories and will be slower than Array
         */


    }

// create a method which cab search a name from this array return true if name is present in the array

    public static boolean contains(String name,String [] names){
        for (String name1:names) {
            if(name.equals(name)){
                return true;
            }
        }
        return false;
    }
}


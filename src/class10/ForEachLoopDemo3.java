package class10;

public class ForEachLoopDemo3 {

    public static void main(String[] args) {

        int [] arr={10,13,20,25,45,50};
        // we can't update the elements in for each loop because we don't have access to the index;
        for (int x:arr){// no index matter here simply java will get the values from the array and store it in x and process it
            if(x%2!=0){
             //   x=0; not replacing values are working here with foreach loop, we can do replacing values with for loop just.
                arr[1]=45;
            }
        }

    }
}

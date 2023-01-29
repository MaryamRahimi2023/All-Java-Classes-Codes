package class15;

public class MethodPractice2 {

    // create a method that takes a String reverse it and return the reversed String.
    // call the method reverseStr

    String reverseStr(String input){ // syntax return type=String,Method=reverseStr,parameters of method=String input, body of the code the rest
        String newStr="";
        for (int i = input.length()-1; i >=0 ; i--) {
            newStr+=input.charAt(i);
        }
        return newStr;
    }

    // 2nd way

    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }

    //3rd way

    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }


}

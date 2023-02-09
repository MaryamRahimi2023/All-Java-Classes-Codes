package class20;

public class Calculator {// overloading is creating methods in these different ways

    void add(int num1,int num2){// first method: method are actions in the class if not we can not use it again like same name as above method
        System.out.println(num1+num2);
    }
    void add(int num1,int num2,int num3){// use this method again by increase the number of parameters
        System.out.println(num1+num2+num3);
    }
    void add(int num1,double num2){// use this method again by change the data type if not we can not use it again like same name as above method
        System.out.println(num1+num2);
    }
    void add(double num2,int num1){// use this method again by change the sequence if not we can not use it again like same as above method
        System.out.println(num1+num2);
    }
}

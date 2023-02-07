package class19_1;

import class19.Teacher;

    public class SeleniumTeacher extends Teacher {

        public static void main(String[] args) {
            SeleniumTeacher selenium= new SeleniumTeacher();

            selenium.homework(); //public
            selenium.grade(); //protected available through the inheritance


            //selenium.scholarship(); //default not available
        }
    }


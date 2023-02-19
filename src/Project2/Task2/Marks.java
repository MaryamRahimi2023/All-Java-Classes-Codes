package Project2.Task2;

public abstract class Marks {

    /* 2. We have to calculate the average of marks obtained in three subjects by student A and by student B. Create class 'Marks' with an abstract
          method 'getPercentage' that will be returning the average percentage of marks. Provide implementation of abstract method in classes
          'A' and 'B'. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its
          parameters for student B. Test your code
     */

    double mathScore;
    double historyScore;
    double scienceScore;

    public Marks(double mathScore, double historyScore, double scienceScore) {

        this.mathScore = mathScore;
        this.historyScore = historyScore;
        this.scienceScore = scienceScore;
    }

    abstract double getPercentage();

}

class StudentA extends Marks{

    public StudentA(double mathScore, double historyScore, double scienceScore) {
        super(mathScore, historyScore, scienceScore);
    }

    double getPercentage() {
        return (mathScore+historyScore+scienceScore)/3;

    }
}
class StudentB extends Marks{

    double biologyScore;

    public StudentB(double mathScore, double historyScore, double scienceScore,double biologyScore) {
        super(mathScore,historyScore,scienceScore);
        this.biologyScore = biologyScore;
    }

    @Override
    double getPercentage() {
        return (mathScore+historyScore+scienceScore+biologyScore)/4;
    }
}



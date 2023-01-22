package Homework05;

public class Student extends Person {
    private double score;

    Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        setScore(score);
    }

    public void showStudentInfo( ){
        this.showPersonInfo();
        System.out.println("Score: " + getScore());
    }
    public void setScore(double score) {
        if (score >= 2 && score <= 6) {
            this.score = score;
        } else if (score < 2){
            this.score = 2;
        } else {
            this.score = 6;
        }
    }

    public double getScore() {
        return score;
    }
}
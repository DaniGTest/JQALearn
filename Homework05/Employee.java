package Homework05;

public class Employee extends Person {
    private double daySalary;

    Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        setDaySalary(daySalary);
    }

    public double calculateOvertime(double hours) {
        if (hours <= 0 || this.getAge() < 18) {
            return 0;
        } else {
            double hourSalary = getDaySalary() / 8;
            double overtimePerHour = hourSalary * 1.5;
            double overtime = overtimePerHour * hours;
            return  overtime;
        }
    }

    public void showEmployeeInfo( ){
        this.showPersonInfo();
        System.out.println("Day salary: " + getDaySalary());
    }

    public void setDaySalary(double daySalary) {
        if (daySalary > 0) {
            this.daySalary = daySalary;
        } else {
           this.daySalary = 1;
        }
    }

    public double getDaySalary() {
        return this.daySalary;
    }
}
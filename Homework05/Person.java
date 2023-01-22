package Homework05;

public class Person {
    private String name;
    private int age;
    private boolean isMan;

    Person (String name, int age, boolean isMan) {
        setName(name);
        setAge(age);
        setIsMan(isMan);
    }

    public void showPersonInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.print("Gender: ");
        if (getIsMan() == true) {
            System.out.println("male");
        } else {
            System.out.println("female");
        }
    }
    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setIsMan(boolean isMan) {
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsMan() {
        return isMan;
    }
}
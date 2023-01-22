package Homework06;

public class Cat extends Animal{

    Cat(String name) {
        setName(name);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Meow meow!");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }

    public void climb() {
        System.out.println("Cat is climbing the tree!");
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

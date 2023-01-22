package Homework06;

public class Dog extends Animal{

    Dog(String name) {
       setName(name);
    }
    @Override
    public void makeSomeNoise() {
        System.out.println("Bau bau!");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }

    public void bringStick() {
        System.out.println("Dog is bringing the stick!");
    }
    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
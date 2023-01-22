package Homework06;

public class Bird extends Animal{
    Bird(String name) {
        setName(name);
    }
    @Override
    public void makeSomeNoise() {
        System.out.println("Tweet Tweet!");
    }

    @Override
    public void play() {
        System.out.println("Bird is playing!");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping!");
    }

    public void fly() {
        System.out.println("Bird is flying!");
    }

    public void sing() {
        System.out.println("Bird is singing");
    }
    
    public void sing(Bird[] birds) {
        for (Bird bird: birds) {
            System.out.println("Bird is singing!");
        }
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
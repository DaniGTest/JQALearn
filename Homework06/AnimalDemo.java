package Homework06;

public class AnimalDemo {
    public static void main(String[] args) {
        /*
            Да се създаде интерфейс IAnimal в който има метод makeSomeNoise()
            Да се създаде абстрактен клас Animal с общи черти за всички животни помислете внимателно.
            Hint: нека да има общ метод play() затова как играят различните животни
            Да се създадат 3 събкласа Bird,Cat и Dog които наследяват клас Animal,
            съответно имат специфични методи и овъррайдват общите за parent класа
            Допълнителни методи в клас:
            Bird - fly(), synk() - като метода synk може да се овърлоудва според броя
            птички,които имаме например при 2 птички звука е по-силен
            Cat - climp()
            Dog - bringStick()
            Да се създаде един демонстративен клас AnimalDemo с main метод,
            в който се създават по един обект от всеки вид животно и се демонстрират
            разликите в методите play() и makeSomeNoise()
         */
        Bird bird1 = new Bird("Tweety");
        Cat cat1 = new Cat("Pisana");
        Dog dog1 = new Dog("Sharo");

        bird1.play();
        bird1.makeSomeNoise();
        bird1.sing();

        cat1.play();
        cat1.makeSomeNoise();

        dog1.play();
        dog1.makeSomeNoise();


        Bird bird2 = new Bird("Tweety2");
        Bird[] birds = {bird1,bird2};
        bird2.sing(birds);
    }
}
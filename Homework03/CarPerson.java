package Homework03;

public class CarPerson {
    public static void main(String[] args) {
        /*
             Да се създаде клас CarPerson, с main метод.
            В рамките на main метода да се създадат 2 обекта от тип Car.

            Да се зададат стойности на всеки от колите за year, price,
            fuelTankCapacity, freeFuel, engineFuelOperationSystem.Нека едината кола да е спортна.
            На едната от колата да е заделено 35 литра гориво (чрез
            метода useFuel), а на другия, да се смени горивната система (чрез
            метода changeЕngineFuelOperationSystem), след което да се изведат на екрана всичките полета на дете коли
         */

        Car car1 = new Car();
        Car car2 = new Car();

        car1.year = 1944;
        car1.price = 28300.300;
        car1.fuelTankCapacity = 46.5;
        car1.freeFuel = 40;
        car1.engineFuelOperationSystem = "gas";
        car1.isSportCar = false;

        car2.year = 1950;
        car2.price = 150000;
        car2.fuelTankCapacity = 55;
        car2.freeFuel = 50;
        car2.engineFuelOperationSystem = "gasoline";
        car2.isSportCar = true;

        car2.useFuel(35);
        car1.changeЕngineFuelOperationSystem("diesel");


        // print car1 properties:
        System.out.println("Car 1 properties are:");
        System.out.println("\tYear of manufacture: " + car1.year);
        System.out.println("\tCar price: " + car1.price);
        System.out.println("\tFuel thank capacity: " + car1.fuelTankCapacity);
        System.out.println("\tFree fuel: " + car1.freeFuel);
        System.out.println("\tEngine fuel operation system: " + car1.engineFuelOperationSystem);
        System.out.println("\tIs Sport car: " + car1.isSportCar);

        // print car2 properties:
        System.out.println("Car 2 properties are:");
        System.out.println("\t Year of manufacture: " + car2.year);
        System.out.println("\t Car price: " + car2.price);
        System.out.println("\t Fuel thank capacity: " + car2.fuelTankCapacity);
        System.out.println("\t Free fuel: " + car2.freeFuel);
        System.out.println("\t Engine fuel operation system: " + car2.engineFuelOperationSystem);
        System.out.println("\t Is Sport car: " + car2.isSportCar);
    }
}
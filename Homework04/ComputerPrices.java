package Homework04;

import javax.swing.plaf.IconUIResource;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;

public class ComputerPrices {
    public static void main(String[] args) {
        /*
        Стойностите/цените на двата компътъра да бъдат изнесени
        в отделен клас ComputerPrices с main метод. Цената на първия
        компютър да бъде декларирана с помоща на обект от клас Computer,
        а цената на втория компютър да бъде извлечена с подаване на
        стойности в конструктора на клас Computer -
        Computer(int year, double price, String operationSystem)
         */
        Computer computer1 = new Computer(2000,"Windows");
        Computer computer2 = new Computer(2000,1500.1,"Windows");

        computer1.price = 1500;
        int result = computer1.comparePrice(computer2);

        if (result == 0) {
            System.out.println("Computer 1 and computer 2 have equal prices: " + computer1.price);
        } else if (result == -1) {
            System.out.println(" Computer 1 price (" + computer1.price + ") > Computer 2 price (" + computer2.price+ ")");
        } else {
            System.out.println(" Computer 1 price (" + computer1.price + ") < Computer 2 price (" + computer2.price+ ")");
        }
    }
}

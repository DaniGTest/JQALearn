package Homework05;

public class DemoClass {
    public static void main(String[] args) {
        /*
        Да се направи иерархия от класовете Person, Student и Employee
        Класът Person репрезентиращ човек да има следните
        Полета:
        – name - име
        – age - години
        – isMan - поле, показващо пола

        Коструктори:
        – Единствен конструктор, с параметри за всичките полета на класа
        Метод:

        – Метод showPersonInfo, който показва информация за човека
        (изписва на конзолата стойността на всичките му полета по
        подходящ начин)
        Класът Student наследяващ Person, репрезентиращ ученик да има
        Полета:
        – score - показва оценката на ученика (число между 2 и 6, не е
        задължително да е цяло)
        Единствен конструктор:
        – Student(String name, int age, boolean isMan, double score)
        задаващ стойности и на наследените полета

        Метод showStudentInfo() който показва информация за човека и
        информация за оценката му (чрез надписи на екрана)
        Класът Employee да наследява Person и да дефинира:
        Полета:
        – daySalary показва дневната заплата на работника
        Конструктор които инициализира всичките му полета (собствени и
        наследени)
        Методи:
        В случай че на работник се наложи да работи извън работно време,
        на него му се дължи допълнителна сума пари (overtime) за часовете
        които
        е работил. Сумата се пресмята по следния начин: ако работника, няма
        навършени 18 години, дължимата сума е 0. В противен случай, за всеки
        отработен час, на работника се заплаща сумата която получава на час
        (зависи от дневната заплата) умножена по 1,5.
        – метод calculateOvertime(double hours) който пресмята и връща
        стойността на сумата която му се дължи при работа извън работно
        време
        – метод showEmployeeInfo(), който показва информация за човека,
        както и информация за дневната му заплата

        Да се напише и демонстративен клас с main метод в който:
        1. Да се състави масив от 10 елемента от тип Person.
        2. Да се създадът по два обекта от тип Person, Student и Employee
        и да се вкарат в масива от хора.
        3. Да се обходим масива и в зависимост от това дали обекта е от
        тип Person, Student или Employee да се извика съответно метода
        showPersonInfo, showStudentInfo или showEmployeeInfo.
        4. Да се обходи още веднъж масива с хора и за всеки човек, който
        е работник, да се изведе на екрана сумата, която му се дължи при
        2 часа работа извън работно време.
         */
        Person[] people = new Person[10];

        Person person1 = new Person("Ivan", 19, true);
        Person person2 = new Person("Maria", 25, false);

        Student student1 = new Student("Petko", 14, true,3.9);
        Student student2 = new Student("Ana", 15, false, 6.0);

        Employee employee1 = new Employee("Georgi", 17, true,150);
        Employee employee2 = new Employee("Galina", 33, false, 90.5);

        people[0] = person1;
        people[1] = person2;
        people[2] = student1;
        people[3] = student2;
        people[4] = employee1;
        people[5] = employee2;

        for (int i = 0; i< people.length; i++) {
            if (people[i] == null) {
                continue;
            } else {
                if (people[i] instanceof Student) {
                    ((Student) people[i]).showStudentInfo();
                } else if (people[i] instanceof Employee) {
                    ((Employee) people[i]).showEmployeeInfo();
                } else {
                    people[i].showPersonInfo();
                }
            }
            System.out.println("=========================");
        }

        for (int i = 0; i< people.length; i++) {
            if (people[i] instanceof Employee) {
                System.out.println(people[i].getName() + " overtime for 2 hours: "
                            + ((Employee) people[i]).calculateOvertime(2));
            }
        }
    }
}
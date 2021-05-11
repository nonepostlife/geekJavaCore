package ru.postlife.java.oop.homework5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Рожков Дмитрий", "Менеджер по продажам", "rozhkov-d@gmail.com", "89462756612", 30000, 23);
        employees[1] = new Employee("Смрнов Андрей", "Инженер", "smirnov-a@gmail.com", "89094573107", 55000, 45);
        employees[2] = new Employee("Петрова Валентина", "Переводчик", "petrova-v@gmail.com", "89471395841", 50000, 30);
        employees[3] = new Employee("Иванов Виктор", "Руководитель отдела", "ivanov-v@gmail.com", "8936173613", 80000, 42);
        employees[4] = new Employee("Самойлова Алёна", "Продавец", "samoilova-a@gmail.com", "82758357417", 25000, 48);

        for (Employee i :
                employees) {
            if (i.getAge() > 40){
                i.info();
            }
        }
    }
}

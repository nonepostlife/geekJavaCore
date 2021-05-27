package ru.postlife.java2.homework1;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        Character[] characters = {
                new Cat("Барсик"),
                new Human("Боб"),
                new Robot("XZ-02M")
        };

        Barrier[] barriers = {
                new Wall((float) Math.random() * 2.2f),
                new Treadmill((float) Math.random() * 5f + 1)
        };

        for (Character c : characters) {
            for (Barrier b : barriers){
                c.run(b);
                c.jump(b);
            }
        }

        System.out.println();
        System.out.println();

        Team team = new Team("BestTeam", "Bob", "Sam", "Ken", "Frank");
        Course course = new Course(barriers);

        team.info();
        course.dolt(team);
        team.showResult();
    }
}

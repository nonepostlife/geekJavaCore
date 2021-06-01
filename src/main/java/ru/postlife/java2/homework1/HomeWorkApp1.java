package ru.postlife.java2.homework1;

public class HomeWorkApp1 {
    public static void main(String[] args) {

        Barrier[] barriers = {
                new Treadmill((float) Math.random() * 5.f),
                new Wall((float) Math.random() + 0.75f),
                new Treadmill( (float) Math.random() + 1.25f)
        };

        Character[] characters = {
                new Human("Bob"),
                new Cat("Barsik"),
                new Human("John"),
                new Robot("XZ-2s")
        };

        for (Character c : characters){
            for (Barrier b : barriers){
                b.overcome(c);
            }
        }

        System.out.println("\n\n");

        Team team = new Team("BestTeam", "Bob", "Sam", "Ken", "Frank");
        Course course = new Course(barriers);

        team.info();
        course.doIt(team);
        team.showResult();
    }
}

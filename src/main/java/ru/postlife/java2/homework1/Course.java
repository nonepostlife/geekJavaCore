package ru.postlife.java2.homework1;

public class Course {
    Barrier[] barriers;

    public Course(Barrier...barriers) {
        this.barriers = barriers;
    }

    public void doIt(Team team) {
        System.out.println("Начало проведения испытаний");
        for (Character c : team.getCharacters()) {
            for(Barrier b : barriers){
                b.overcome(c);
            }
        }
    }
}
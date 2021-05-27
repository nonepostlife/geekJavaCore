package ru.postlife.java2.homework1;

public class Course {
    private Barrier[] barriers;

    public Course(Barrier...barriers) {
       this.barriers = barriers;
    }

    public void dolt(Team team) {
        for (Character c : team.getCharacters()) {
            for(Barrier b : barriers){
                c.jump(b);
                c.run(b);
            }
        }
    }
}

package ru.postlife.java2.homework1;

public class Wall implements Barrier{
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public void overcome(Character c) {
        c.jump(height);
    }
}
package ru.postlife.java2.homework1;

public class Wall implements Barrier{
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public void overcome(String name, float inHeight) {
        System.out.printf("%s перепрыгнул через стену %.3fm\n", name, inHeight);
    }
}


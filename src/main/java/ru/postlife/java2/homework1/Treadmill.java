package ru.postlife.java2.homework1;

public class Treadmill implements Barrier{
    private float distance; // km

    public Treadmill(float distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Character c) {
        c.run(distance);
    }
}
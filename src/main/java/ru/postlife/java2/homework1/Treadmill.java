package ru.postlife.java2.homework1;

public class Treadmill implements Barrier{
    private float distance; // km

    public Treadmill(float distance) {
        this.distance = distance;
    }

    public float getDistance() {
        return distance;
    }

    @Override
    public void overcome(String name, float inDistance) {
        System.out.printf("%s пробежал на беговой дорожке %.3fkm\n", name, inDistance);
    }
}

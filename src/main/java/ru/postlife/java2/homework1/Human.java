package ru.postlife.java2.homework1;

public class Human implements Character {
    private String name;
    private final float maxHeightJump = (float) Math.random() * 0.5f + 1.f;
    private final float maxDistanceRun = (float) Math.random() * 4.f + 3.f;
    private boolean isOvercome = true;

    public Human(String name) {
        this.name = name;
    }

    public boolean isOvercome() {
        return isOvercome;
    }

    public String getName() {
        return name;
    }

    public float getMaxHeightJump() {
        return maxHeightJump;
    }

    public float getMaxDistanceRun() {
        return maxDistanceRun;
    }

    @Override
    public void run(float distance) {
        if (isOvercome) {
            if (distance < maxDistanceRun) {
                System.out.printf("%s пробежал на беговой дорожке %.3fkm\n", name, distance);
            } else {
                System.out.printf("%s не смог пробежать %.3fkm [ Max distance: %.3fkm]. Снят с испытаний\n", name, distance, maxDistanceRun);
                isOvercome = false;
            }
        }
    }

    @Override
    public void jump(float height) {
        if (isOvercome) {
            if (height < maxHeightJump) {
                System.out.printf("%s перепрыгнул через препятствие %.3fkm\n", name, height);
            } else {
                System.out.printf("%s не смог перепрыгнуть через препятствие %.3fkm [ Max height: %.3fkm]. Снят с испытаний\n", name, height, maxHeightJump);
                isOvercome = false;
            }
        }
    }
}
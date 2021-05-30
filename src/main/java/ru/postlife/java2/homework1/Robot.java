package ru.postlife.java2.homework1;

public class Robot implements Character {
    private String name;
    private final float maxHeightJump = 2.0f;
    private final float maxDistanceRun = 15f;
    private boolean isOvercome = true;

    public Robot(String name) {
        this.name = name;
    }

    public boolean isOvercome() {
        return isOvercome;
    }

    public String getName() {
        return name;
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
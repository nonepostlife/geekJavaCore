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
    public void run(Barrier b) {
        if (b instanceof Treadmill) {
            if (isOvercome) {
                Treadmill treadmill = (Treadmill) b;
                if (maxDistanceRun > treadmill.getDistance()) {
                    b.overcome(name, treadmill.getDistance());
                } else {
                    System.out.printf("%s не смог пробежать %.3fkm [ Max distance: %.3fkm]\n", name, treadmill.getDistance(), maxDistanceRun);
                    isOvercome = false;
                }
            } else {
                System.out.println(name + " снят с дистанции");
            }
        }
    }

    @Override
    public void jump (Barrier b){
        if (b instanceof Wall) {
            if(isOvercome) {
                Wall wall = (Wall) b;
                if (maxHeightJump > wall.getHeight()) {
                    b.overcome(name, wall.getHeight());
                } else {
                    System.out.printf("%s не смог перепрыгунть стену высотой %.3fm [ Max height: %.3fm]\n", name, wall.getHeight(), maxHeightJump);
                    isOvercome = false;
                }
            } else {
                System.out.println(name + " снят с дистанции");
            }
        }
    }
}
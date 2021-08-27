package ru.postlife.ads.lesson2;

public enum Brand {
    LENUVO(4),
    ASOS(3),
    MACNOTE(2),
    ESER(1),
    XAMIOU(0);

    private final int priority;

    Brand(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}

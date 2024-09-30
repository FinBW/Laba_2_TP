package org.example;

public enum WallHeight implements Challenge{
    LOW("Маленькая", 2),MEDIUM("Средняя", 5), HIGH("Высокая", 10);

    private final   int height;
    WallHeight(String title, int height) {

        this.height = height;
    }

    public boolean isCan(Participant obj) {
        return Contest.jumpContest(obj, height);
    }
}

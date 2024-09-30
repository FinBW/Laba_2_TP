package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat(4, 500, "Kitik"),
                new Cat(3, 400, "Kishka"),
                new Human(2, 300, "Jesus"),
                new Human(3, 555, "Forest"),
                new Robot(11, 600, "Bolt"),
                new Robot(11, 700, "BostonDynamiks")
        };
        Challenge[] challenges = {
                RoadLenght.LOW,
                RoadLenght.HIGH,
                WallHeight.LOW,

                RoadLenght.MEDIUM,
                RoadLenght.HIGH,
                WallHeight.MEDIUM
        };

        for (Participant p : participants) {
            for (Challenge c : challenges) {
                if (!c.isCan(p)) break;

            }
        }
    }
}
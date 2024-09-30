package org.example;

public class Contest {
    static int  hasSuperRun  = 1;

    public static boolean jumpContest( Participant actions, int height) {
        if (actions.jump(height)) {
            System.out.printf("'%s' перепрыгнул %s m.\n", actions.getName(), height);
            return true;
        } else {
            System.out.printf("'%s' не смог перепрыгнуть %s m.\n", actions.getName(), height);
            System.out.printf("'%s' выбывает.\n\n", actions.getName());
            return false;
        }
    }


    public static boolean runContest(Participant actions, int dist) {

        if (actions.run(dist)) {
            System.out.printf("'%s' пробежал %s m.\n", actions.getName(), dist);
            return true;
        } else if (((SuperRun) actions).superRun(actions, dist)) {
            return true;
        } else {

            System.out.printf("'%s' не смог пробежать %s m.\n", actions.getName(), dist);
            System.out.printf("'%s' выбывает.\n\n", actions.getName());
            return false;
        }
    }
    }




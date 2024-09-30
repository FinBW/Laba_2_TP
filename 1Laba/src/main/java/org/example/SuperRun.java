package org.example;

    public interface SuperRun {

        default boolean superRun(Participant actions, int dist) {
           if (Contest.hasSuperRun > 0) {
                System.out.printf("'%s' получил волшебный пендель и преодолел свои лимиты %s m. \n", actions.getName(), dist);
                Contest.hasSuperRun = 0;
                return true;
            }else { Contest.hasSuperRun = 1;
            return false;}
        }




    }

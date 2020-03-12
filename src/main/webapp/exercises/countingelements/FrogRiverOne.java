package main.webapp.exercises.countingelements;

import java.util.ArrayList;


/**
 *
 */
public class FrogRiverOne {

    /**
     * @param destination destination point
     * @param leavesArr array of leaves dropped per second
     * @return
     */
    public static int solution(int destination, int[] leavesArr) {
        int early = 0;
        ArrayList<Integer> leavesNeeded = new ArrayList<>();

        //Number of leaves needed
        for (int i = 0; i < destination; i++) {
            leavesNeeded.add(i+1);
        }

        for (int j = 0; j < leavesArr.length; j++) {
            if (leavesNeeded.contains(Integer.valueOf(leavesArr[j]))) {
                leavesNeeded.remove(Integer.valueOf(leavesArr[j]));

                early = j;

                if (leavesNeeded.size() == 0) {
                    break;
                }
            }
        }

        if (leavesNeeded.size() > 0) {
            return -1;
        }
        return early;
    }
}

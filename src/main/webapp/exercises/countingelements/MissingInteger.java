package main.webapp.exercises.countingelements;

import java.util.Arrays;

/**
 * Finished in ~45mins (Score : 100%, Correctness(100%) + Performance(100%))
 *
 * @return int
 */
public class MissingInteger {
    public static int solution(int[] A) {
        int smallest = 1;
        int prev = 0;
        Arrays.sort(A);

        for (int arrElem : A) {
            if (arrElem > 0 && (arrElem - prev) > 1) {
                return prev + 1;
            } else {
                if (arrElem < 0) {
                    continue;
                } else {
                    prev = arrElem;
                    smallest = arrElem + 1;
                }
            }
        }

        return  smallest;
    }
}

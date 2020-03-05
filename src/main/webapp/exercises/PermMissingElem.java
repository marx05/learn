package main.webapp.exercises;

import java.util.Arrays;

/**
 *
 */
public class PermMissingElem {
    public static int solution(int A[]) {
        //each element of array A is an integer within the range [1..(N + 1)].
        int missingElement = 1;

        if (A.length == 0) {
            return missingElement;
        } else if (A.length == 1) {
            if (A[0] == 1) {
                return missingElement + 1;
            } else {
                return missingElement;
            }
        } else if (A[A.length-1] == A.length) {
            return A[A.length-1] + 1;
        }
        Arrays.sort(A);
        //System.out.println("length : " + A.length);

        for (int i = 0; i < A.length; i++) {
            //System.out.println("i : " + i + " : " + A[i]);
            if (A[0] != 1) {
                missingElement = 1;
                break;
            } else if (A[i+1]-A[i] > 1) {
                missingElement = A[i] + 1;
                break;
            }
        }
        return missingElement;
    }
}

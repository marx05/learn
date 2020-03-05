package main.webapp.exercises;

/**
 * Finished in ~40mins (Score : 100%, correctness only)
 */
public class CyclicRotation {

    public static int[] solution(int[] cycArr, int rotations) {

        if (cycArr == null) {
            return null;
        }

        int[] rotatedArr = new int[cycArr.length];
        for (int i = 0; i < cycArr.length; i++) {
            rotatedArr[(i + rotations) % cycArr.length] = cycArr[i];
        }

        return rotatedArr;
    }
}

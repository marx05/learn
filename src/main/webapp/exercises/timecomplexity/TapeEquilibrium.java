package main.webapp.exercises.timecomplexity;

import java.util.Arrays;

public class TapeEquilibrium {
    /**
     * Finished in ~2hrs (Score : 53%, Correctness(100%) + Performance(0%))
     * @param A
     * @return
     */
    public static int solutionA(int A[]) {
        int minDiff;
        int leftSum;
        int rightSum;
        int currDiff;
        int[] diffArr = new int[A.length-1];

        for (int i = 0; i < (A.length-1); i++) {
            leftSum = Arrays.stream(A, 0, (i+1)).sum();
            rightSum = Arrays.stream(A, (i+1), (A.length)).sum();
            currDiff = Math.abs(leftSum - rightSum);

            diffArr[i] = currDiff;
        }

        Arrays.sort(diffArr);
        minDiff = diffArr[0];

        return minDiff;
    }
    /**
     * Finished in ~5mins (Score : 53%, Correctness(100%) + Performance(0%))
     * @param A
     * @return
     */
    public static int solutionB(int A[]) {
        int minDiff = 2000;
        int leftSum;
        int rightSum;
        int currDiff;

        for (int i = 0; i < (A.length-1); i++) {
            leftSum = Arrays.stream(A, 0, (i+1)).sum();
            rightSum = Arrays.stream(A, (i+1), (A.length)).sum();
            currDiff = Math.abs(leftSum - rightSum);
            System.out.println(leftSum + " - " + rightSum + " = " + currDiff);

            if (currDiff < minDiff) {
                minDiff = currDiff;
            }

        }

        return minDiff;
    }

    /**
     * Finished in ~5mins (Score : 53%, Correctness(100%) + Performance(0%))
     * @param A
     * @return
     */
    public static int solutionC(int A[]) {
        int minDiff = 2000;
        int leftSum = 0;
        int rightSum = 0;
        int currDiff;

        for (int i = 0; i < (A.length-1); i++) {
            //left tape
            for (int l = 0; l <= i; l++) {
                leftSum = leftSum + A[l];
            }

            //right tape
            for (int r = A.length-1; r > i; r--) {
                rightSum = rightSum + A[r];
            }

            currDiff = Math.abs(leftSum - rightSum);
            leftSum = 0;
            rightSum = 0;
            if (currDiff < minDiff) {
                minDiff = currDiff;
            }

        }

        return minDiff;
    }

    /**
     * 2 loops
     *
     * Finished in ~30mins (Score : 100%, Correctness(100%) + Performance(100%))
     * @param A
     * @return
     */
    public static int solutionD(int[] A) {
        int minDiff = 2000; //{-1000, 1000}
        int arrSum = 0;
        int rightSum = 0;
        int leftSum;
        int currDiff;

        //maximum difference
        for (int i = 0; i < A.length; i++) {
            arrSum = arrSum + A[i];
        }

        //set right tape then calculate left tape and difference
        for (int i = A.length-1; i > 0; i--) {
            rightSum = rightSum + A[i];
            leftSum = arrSum - rightSum;
            currDiff = Math.abs(leftSum - rightSum);
//            System.out.println(leftSum + " - " + rightSum + " = " + currDiff);
            if (currDiff < minDiff) {
                minDiff = currDiff;
            }
        }
        return minDiff;
    }
}

package main.webapp;

import main.webapp.exercises.*;

import java.util.logging.Logger;

import static main.webapp.exercises.FrogJump.solution;

public class Practice {

    private static final Logger LOGGER = Logger.getLogger(Practice.class.getName());

    public static void main(String[] args) {

        //BinaryGap
//        int[] binaryGapTests = {1041, 1, 4, 5, 15, 147, 483, 647, 1025, 2046, 9999};
//        for (int i = 0; i < binaryGapTests.length; i++) {
//            BinaryGap.solution(binaryGapTests[i]);
//        }
//
//        //OddOccurences in Array
//        int[] oddArr = {1, 1, 2, 2, 2, 2, 4, 2, 5, 5, 2};
//        int noPair1 = OddOccurences.solutionWithConversion(oddArr);
//        LOGGER.info("noPair1 : " + noPair1);
//        int noPair2 = OddOccurences.solution(oddArr);
//        LOGGER.info("noPair2 : " + noPair2);
//
//        //Cyclic Rotation
//        int[] cycArr = {3, 8, 9, 7, 6};
//        int rotation = 3;
//        int[] rotatedArr = CyclicRotation.solution(cycArr, rotation);
//
//        for (int k = 0; k < rotatedArr.length; k++) {
//            System.out.println("Final positions " + rotatedArr[k]);
//        }
//
//        //Frog Jump
//        int start = 10;
//        int dest = 41;
//        int jumpDist = 30;
//        int jumpCount = FrogJump.solution(start, dest, jumpDist);
//        System.out.println("Frog needs to jump " + jumpCount + " times to travel from " + start + " to " + dest);

        //PermMissingElem
        int[][] A = {{}, {1}, {3, 2}, {1, 2}, {2, 3}, {2, 3, 4}, {1, 2, 4}, {1, 2, 3}};
        for (int i = 0; i < A.length; i++) {
            System.out.println("Missing Element : " + PermMissingElem.solution(A[i]));
        }


    }

}

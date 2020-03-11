package main.webapp;

import main.webapp.exercises.countingelements.MissingInteger;
import main.webapp.exercises.timecomplexity.PermMissingElem;
import main.webapp.exercises.timecomplexity.TapeEquilibrium;

import java.util.logging.Logger;

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
//        int[][] permMissingElemA = {{}, {1}, {3, 2}, {1, 2}, {2, 3}, {2, 3, 4}, {1, 2, 4}, {1, 2, 3}};
//        for (int i = 0; i < permMissingElemA.length; i++) {
//            System.out.println("Missing Element : " + PermMissingElem.solution(permMissingElemA[i]));
//        }

        //TapeEquilibrium
//        int[][] tapeEquilibriumA = {{-1000, 1000}
//            , {3, 1, 2, 4, 3}
//            , {-3, 2, 1, -7, 10}
//            ,{-10, 2, 10, 20, 99, -99}};//
//        for (int i = 0; i < tapeEquilibriumA.length; i++) {
//            System.out.println("Min Diff Solution[A] : " + TapeEquilibrium.solutionA(tapeEquilibriumA[i]));
//            System.out.println("Min Diff Solution[B] : " + TapeEquilibrium.solutionB(tapeEquilibriumA[i]));
//            System.out.println("Min Diff Solution[C] : " + TapeEquilibrium.solutionC(tapeEquilibriumA[i]));
//            System.out.println("Min Diff Solution[D] : " + TapeEquilibrium.solutionD(tapeEquilibriumA[i]));
//        }

        //MissingInteger
        int[] largeArr = new int[100000];

        for (int i = 0; i < largeArr.length; i++) {
            largeArr[i] = i;
        }

        int[][] missingIntegerA = {{-1000, 1000}
                , {3, 7, 2, 4, 6}
                , {-3, -7}
                , {1, 2, 3}
                , {1, 3, 6, 4, 1, 2}
                , {1, 1000000}
                , largeArr
                , {-1000000, 1, 1000000}};//
        for (int i = 0; i < missingIntegerA.length; i++) {
            System.out.print("Array Values : ");
            for (int arrayElement : missingIntegerA[i]) {
                System.out.print(arrayElement + " ");
            }
            System.out.println("\nMissing Integer : " + MissingInteger.solution(missingIntegerA[i]));
        }
    }

}

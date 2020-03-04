package main.webapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        //BinaryGap
//        int[] binaryGapTests = new int[]{1041, 1, 4, 5, 15, 147, 483, 647, 1025, 2046, 9999};
//        for (int i = 0; i < binaryGapTests.length; i++) {
//            findMaxBinaryGap(binaryGapTests[i]);
//        }

        //OddOccurences in Array
//        findOddOccurencesWithConversionToInteger();
        findOddOccurences();

    }

    private static void findOddOccurences() {
        int[] A = {1, 1, 2, 2, 2, 2, 4, 2, 5, 5, 2};
        int noPair = 0;
        int frequency = 0;
        for (int arrayValue : A) {
            for (int e : A) {
                if (arrayValue == e) {
                    frequency++;
                }
            }
//            System.out.println("frequency of " +  arrayValue + " is " + frequency);
            if (frequency%2 != 0) {
                noPair = arrayValue;
                break;
            }
            frequency = 0;
        }
//        System.out.println("noPair : " + noPair);
        return noPair;
    }

    private static void findOddOccurencesWithConversionToInteger() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int noPair = 0;
//        Integer[] integerArray = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Integer[] integerArray = new Integer[A.length];

        for (int i = 0 ; i < A.length; i ++) {
            integerArray[i] = A[i];
        }

        List<Integer> sampleList = Arrays.asList(integerArray);

        for(int arrayValue : integerArray){

            int frequency= Collections.frequency(sampleList, arrayValue);
            if (frequency%2 != 0) {
//                return arrayValue;
                System.out.println(arrayValue + " has no pair");
            }
        }
    }

    private static void findMaxBinaryGap(int number) {
        String binaryStr = Integer.toBinaryString(number);
        int openGap = binaryStr.indexOf("10");
        int closeGap = binaryStr.lastIndexOf("01");
        int maxBinaryGap = 0;
        int currentGap = 0;

        if (binaryStr.length() > 2 && closeGap > 0) {
            String truncBinaries = binaryStr.substring(openGap, closeGap + 2);

            for (int i = 0; i < truncBinaries.length(); i++) {
                if (truncBinaries.charAt(i) == '0') {
                    currentGap++;
                } else {
                    if (currentGap > maxBinaryGap) {
                        maxBinaryGap = currentGap;
                    }
                    currentGap = 0;
                }
            }
            System.out.println("[" + number + "] having a binary equivalent value of [" + binaryStr + "] has a max Binary Gap of " + maxBinaryGap);
        } else {
            System.out.println("[" + number + "] having a binary equivalent value of [" + binaryStr + "] has no Binary Gap ");
        }
    }
}

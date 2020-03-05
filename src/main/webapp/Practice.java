package main.webapp;

import java.util.logging.Logger;

import static main.webapp.exercises.BinaryGap.findMaxBinaryGap;
import static main.webapp.exercises.OddOccurences.findOddOccurences;
import static main.webapp.exercises.OddOccurences.findOddOccurencesWithConversionToInteger;

public class Practice {

    private static final Logger LOGGER = Logger.getLogger(Practice.class.getName());

    public static void main(String[] args) {

        //BinaryGap
        int[] binaryGapTests = new int[]{1041, 1, 4, 5, 15, 147, 483, 647, 1025, 2046, 9999};
        for (int i = 0; i < binaryGapTests.length; i++) {
            findMaxBinaryGap(binaryGapTests[i]);
        }

        //OddOccurences in Array
        int[] intA = {1, 1, 2, 2, 2, 2, 4, 2, 5, 5, 2};
        int noPair1 = findOddOccurencesWithConversionToInteger(intA);
        LOGGER.info("noPair1 : " + noPair1);
        int noPair2 = findOddOccurences(intA);
        LOGGER.info("noPair2 : " + noPair2);

    }

}

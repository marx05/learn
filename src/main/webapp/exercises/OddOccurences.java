package main.webapp.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class OddOccurences {

    private static final Logger LOGGER = Logger.getLogger(OddOccurences.class.getName());

    public static int findOddOccurences(int[] intA) {

//        LOGGER.info("START : findOddOccurences");
        int noPair = 0;
        int frequency = 0;
        for (int arrayValue : intA) {
            for (int e : intA) {
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
//        LOGGER.info("END : findOddOccurences");
        return noPair;

    }

    public static int findOddOccurencesWithConversionToInteger(int[] intA) {

//        LOGGER.info("START : findOddOccurencesWithConversionToInteger");
        int noPair = 0;

        //primitive conversion to Integer naive
        Integer[] integerArray = new Integer[intA.length];
        for (int i = 0 ; i < intA.length; i ++) {
            integerArray[i] = intA[i];
        }

        //primitive conversion to Integer using stream, seems slower
//        Integer[] integerArray = Arrays.stream(A).boxed().toArray(Integer[]::new);

        List<Integer> sampleList = Arrays.asList(integerArray);

        for(int arrayValue : integerArray){

            int frequency= Collections.frequency(sampleList, arrayValue);
            if (frequency%2 != 0) {
                noPair = arrayValue;
            }
        }
//        LOGGER.info("END : findOddOccurencesWithConversionToInteger");
        return noPair;
    }
}
package main.webapp.exercises;

import java.util.logging.Logger;

public class BinaryGap {
    private static final Logger LOGGER = Logger.getLogger(BinaryGap.class.getName());

    public static void findMaxBinaryGap(int number) {
//        LOGGER.info("START : findMaxBinaryGap");

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

//        LOGGER.info("END : findMaxBinaryGap");
    }
}

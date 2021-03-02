package com.company;

import java.util.*;

public class CalculationListPerformance {

    public long[] getArrayPerformancesOfInsertByPositions(int[] positions, String word,
                                                          List<String> list) {
        if (!list.isEmpty()) {
            long[] performances = new long[positions.length];

            for (int i = 0; i < positions.length; i++) {
                StopWatch stopWatch = new StopWatch();
                list.set(positions[i], word);
                long elapsedTime = stopWatch.getElapsedTime();
                performances[i] = elapsedTime;
            }
            return performances;
        } else {
            System.out.println("Check input data");
            return new long[1];
        }
    }
}

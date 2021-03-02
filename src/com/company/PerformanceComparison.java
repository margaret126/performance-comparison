package com.company;

import java.util.*;

public class PerformanceComparison {
    private String word;
    private int[] positions;
    private CalculationListPerformance calculationListPerformance;

    public PerformanceComparison(String word, int[] positions,
                                 CalculationListPerformance calculationListPerformance) {
        this.word = word;
        this.positions = positions;
        this.calculationListPerformance = calculationListPerformance;
    }

    public void compareArrayAndLinkedLists(List<String> arrayList, List<String> linkedList) {
        long[] performancesArrayList =
                calculationListPerformance.getArrayPerformancesOfInsertByPositions(positions, word, arrayList);

        long[] performancesLinkedList =
                calculationListPerformance.getArrayPerformancesOfInsertByPositions(positions, word, linkedList);
        showDetailCompare(performancesArrayList, performancesLinkedList);
    }

    private void showDetailCompare(long[] performancesArrayList, long[] performancesLinkedList) {
        System.out.println("=== for an array of size " + performancesArrayList.length + " ===");
        System.out.println("Performances the array List: " + Arrays.toString(performancesArrayList));
        System.out.println("Performances the linked list: " + Arrays.toString(performancesLinkedList));

        for (int i = 0; i < performancesArrayList.length; i++) {
            String result;
            if(performancesArrayList[i] >  performancesLinkedList[i]){
                result = "linked list";
            } else {
                result = "array list";
            }
            System.out.println("Insert on " + positions[i] + " position the fastest - " + result);
        }
    }
}

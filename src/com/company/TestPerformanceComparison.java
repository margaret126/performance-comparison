package com.company;

import java.util.*;

public class TestPerformanceComparison {
    private Random random = new Random();
    private int  lengthWordArray;
    private GeneratorRandomString generatorRandomString;
    private GeneratorStringArray generatorStringArray;
    private GeneratorFilledList generatorFilledList;
    private int[] positions;
    private String insertValue;

    public TestPerformanceComparison(int sizeList, int minCountLetters, int maxCountLetters ) {
        lengthWordArray = sizeList;
        generatorRandomString = new GeneratorRandomString(minCountLetters, maxCountLetters, this.random);
        generatorStringArray =  new GeneratorStringArray(lengthWordArray);
        generatorFilledList= new GeneratorFilledList(lengthWordArray,
                generatorStringArray, generatorRandomString);
        positions = new int[] {0, 5_000, lengthWordArray-1};
        insertValue = generatorRandomString.getRandomWord();
    }

    public static void main(String[] args) {
        TestPerformanceComparison testData = new TestPerformanceComparison(10_000, 5,8);

        ArrayList<String> arrayList = testData.generatorFilledList.getArrayList();
        LinkedList<String> linkedList = testData.generatorFilledList.getLinkedList();

        CalculationListPerformance calculationListPerformance = new CalculationListPerformance();

        PerformanceComparison performanceComparison =
                new PerformanceComparison(testData.insertValue, testData.positions, calculationListPerformance);
        performanceComparison.compareArrayAndLinkedLists(arrayList, linkedList);
    }
}
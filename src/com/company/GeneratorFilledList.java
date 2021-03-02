package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class GeneratorFilledList {
    private int listSize;
    private GeneratorRandomString generatorRandomString;
    private String[] insertWords;

    public GeneratorFilledList(int listSize,
                               GeneratorRandomString generatorRandomString) {
        this.listSize = listSize;
        this.generatorRandomString = generatorRandomString;
        this.insertWords = generateRandomWords();
    }

    public ArrayList<String> getArrayList() {
        return new ArrayList<>(Arrays.asList(insertWords));
    }

    public LinkedList<String> getLinkedList() {
        return new LinkedList<>(Arrays.asList(insertWords));
    }

    private String[] generateRandomWords() {
        String[] words = new String[listSize];
        for (int i = 0; i < listSize; i++) {
            words[i] = generatorRandomString.getRandomWord();
        }
        return words;
    }
}

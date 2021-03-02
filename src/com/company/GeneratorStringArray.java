package com.company;

public class GeneratorStringArray {
    private int size;

    GeneratorStringArray(int size) {
        this.size = size;
    }

    public String[] getStringArray(GeneratorRandomString generatorRandomString) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++)
            array[i] = generatorRandomString.getRandomWord();
        return array;
    }
}

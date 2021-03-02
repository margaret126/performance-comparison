package com.company;

import java.util.Random;

public class GeneratorRandomString {
    private static final char[] pool = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z'};

    public Random random;
    private int minCountLetters;
    private int maxCountLetters;
    private int wordLength;

    public GeneratorRandomString(int minCountLetters, int maxCountLetters, Random random) {
        this.minCountLetters = minCountLetters;
        this.maxCountLetters = maxCountLetters;
        this.wordLength = getRandomWordLength();
        this.random = random;
    }

    private int getRandomWordLength() {
        maxCountLetters -= minCountLetters;
        return (int) (Math.random() * ++maxCountLetters) + minCountLetters;
    }

    private char getRandomLatter() {
        return pool[random.nextInt(pool.length)];
    }

    public String getRandomWord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordLength; i++)
            sb.append(getRandomLatter());
        return new String(sb);
    }
}

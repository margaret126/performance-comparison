package com.company;

public class StopWatch {
    private final long start;

    public StopWatch() {
        this.start = System.nanoTime();
    }

    public long getElapsedTime() {
        long stop = System.nanoTime();
        return stop - start;
    }
}

package com.example;

public class kub {
    private final long side;

    public kub(long s) {
        this.side = s;
    }

    public long getVolume() {
        return (long) Math.pow(side, 3);
    }

    public long getSurfaceArea() {
        return (long) (6 * Math.pow(side, 2));
    }
}
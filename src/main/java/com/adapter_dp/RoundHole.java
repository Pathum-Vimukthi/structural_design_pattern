package com.adapter_dp;

public class RoundHole {
    private int radius;
    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public RoundPeg fits(){
        return new RoundPeg(radius);
    }
}

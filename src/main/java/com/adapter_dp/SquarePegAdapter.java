package com.adapter_dp;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg sp;
    public SquarePegAdapter(int radius, SquarePeg sp) {
        super(radius);
        this.sp = sp;
    }
}

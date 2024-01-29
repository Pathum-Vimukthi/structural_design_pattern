package com.facade_dp;

public class Demo {
    public static void main(String[] args) {
        MultimediaFacade mf = new MultimediaFacade();
        mf.playAudio("Pamawee Pipunu Mal Suwadai..");
        mf.playVideo("Scooby Doo...");
        mf.projectOnScreen();
    }
}

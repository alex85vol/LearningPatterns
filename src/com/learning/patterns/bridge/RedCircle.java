package com.learning.patterns.bridge;

/**
 * Created by ovo on 09.02.2017.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color ; red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}

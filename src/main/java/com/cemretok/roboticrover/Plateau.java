package com.cemretok.roboticrover;

public class Plateau {

    private int minY=0;
    private int minX=0;
    private int maxY;
    private int maxX;

    public Plateau(int maxY, int maxX) {
        this.maxY = maxY;
        this.maxX = maxX;
    }

    public int getMinY() {
        return minY;
    }

    public void setMinY(int minY) {
        this.minY = minY;
    }

    public int getMinX() {
        return minX;
    }

    public void setMinX(int minX) {
        this.minX = minX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }
}

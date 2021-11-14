package com.cemretok.roboticrover.enums;

public enum Directions {
    NORTH("N", "W", "E"),
    EAST("E","N", "S"),
    SOUTH("S","E", "W"),
    WEST("W","S", "N");

    public final String value;
    public final String left;
    public final String right;

    Directions(String value, String left, String right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Directions right() {
        return getDirection(right);
    }

    public Directions left() {
        return getDirection(left);
    }

    private Directions getDirection(String value) {
        for (Directions direction : values()) {
            if (direction.value.equals(value)) {
                return direction;
            }
        }
        return null;
    }

}

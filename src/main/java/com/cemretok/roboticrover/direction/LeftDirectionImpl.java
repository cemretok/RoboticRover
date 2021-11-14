package com.cemretok.roboticrover.direction;

import com.cemretok.roboticrover.enums.Directions;

public class LeftDirectionImpl implements IDirection {

    @Override
    public Directions rotate(Directions direction) {
            return direction.left();
    }
}

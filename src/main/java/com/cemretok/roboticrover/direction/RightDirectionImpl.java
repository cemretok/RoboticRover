package com.cemretok.roboticrover.direction;

import com.cemretok.roboticrover.enums.Directions;

public class RightDirectionImpl implements IDirection {

    @Override
    public Directions rotate(Directions direction) {
        return direction.right();
    }
}

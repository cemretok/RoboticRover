package com.cemretok.roboticrover.move;

import com.cemretok.roboticrover.Coordinate;
import com.cemretok.roboticrover.Plateau;
import com.cemretok.roboticrover.enums.Directions;

public interface IMove {

    Coordinate moveForward(Plateau plateau, Coordinate coordinate, Directions directions);

    Boolean isInPlateauBoundaries(Plateau plateau, Coordinate coordinate);
}

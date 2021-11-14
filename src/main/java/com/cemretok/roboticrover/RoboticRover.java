package com.cemretok.roboticrover;

import com.cemretok.roboticrover.direction.LeftDirectionImpl;
import com.cemretok.roboticrover.direction.RightDirectionImpl;
import com.cemretok.roboticrover.enums.Directions;
import com.cemretok.roboticrover.exception.WrongCommandException;
import com.cemretok.roboticrover.move.MoveImpl;

class RoboticRover {

    private Directions direction;
    private final Plateau plateau;
    private Coordinate coordinate;

    public RoboticRover(Plateau plateau, Directions direction, Coordinate coordinate) {
        this.plateau = plateau;
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = new RightDirectionImpl().rotate(direction);
            } else if (c == 'L') {
                direction = new LeftDirectionImpl().rotate(direction);
            } else if (c == 'M') {
                var newCoordinate = new MoveImpl().moveForward(plateau, coordinate, direction);
                if (new MoveImpl().isInPlateauBoundaries(plateau, newCoordinate)) {
                    coordinate = newCoordinate;
                }
            } else {
                throw new WrongCommandException("Unexpected command exception");
            }
        }

        return coordinate.getX() + " " + coordinate.getY() + " " + direction.value;
    }


}

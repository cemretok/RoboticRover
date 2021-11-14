package com.cemretok.roboticrover.move;

import com.cemretok.roboticrover.Coordinate;
import com.cemretok.roboticrover.Plateau;
import com.cemretok.roboticrover.enums.Directions;

public class MoveImpl implements IMove {

    @Override
    public Coordinate moveForward(Plateau plateau, Coordinate coordinate, Directions direction) {
        int y = coordinate.getY();
        int x = coordinate.getX();

        if (direction.equals(Directions.NORTH)) {
            y = (y + 1);
        }else if (direction.equals(Directions.EAST)) {
            x = (x + 1);
        }else if (direction.equals(Directions.SOUTH)) {
            y =  (y - 1) ;
        }else if (direction.equals(Directions.WEST)) {
            x =  (x - 1);
        }

        return new Coordinate(x, y);
    }

    @Override
    public Boolean isInPlateauBoundaries(Plateau plateau, Coordinate coordinate){
        return  coordinate.getX() >= plateau.getMinX() &&
                coordinate.getX() <= plateau.getMaxX() &&
                coordinate.getY() >= plateau.getMinY() &&
                coordinate.getY() <= plateau.getMaxY();

    }


}

package com.cemretok.roboticrover;

import com.cemretok.roboticrover.enums.Directions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoboticRoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoboticRoverApplication.class, args);

        Plateau plateau = new Plateau(5,5);
        Directions directions1= Directions.NORTH;
        Coordinate coordinate1 = new Coordinate(1,2);
        RoboticRover roboticRover1 = new RoboticRover(plateau,directions1,coordinate1);
        System.out.println(roboticRover1.execute("LMLMLMLMM"));

        Coordinate coordinate2 = new Coordinate(3,3);
        Directions directions2= Directions.EAST;
        RoboticRover roboticRover2 = new RoboticRover(plateau,directions2,coordinate2);
        System.out.println(roboticRover2.execute("MMRMMRMRRM"));
    }

}

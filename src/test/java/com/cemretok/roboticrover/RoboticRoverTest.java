package com.cemretok.roboticrover;

import com.cemretok.roboticrover.enums.Directions;
import com.cemretok.roboticrover.exception.WrongCommandException;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
public class RoboticRoverTest {
    private RoboticRover roboticRover;

    @Before
    public void initialize() {
        Plateau plateau = new Plateau(8,8);
        Coordinate coordinate = new Coordinate(0,0);
        Directions directions = Directions.NORTH;
        roboticRover = new RoboticRover(plateau,directions,coordinate);
    }

    @Test
    public void it_should_robotic_rover_turn_right() {
        //given
        String commands = "RRR";
        //when
        String resultCoordinate = roboticRover.execute(commands);
        //then
        assertThat(resultCoordinate).isEqualTo("0 0 W");
    }

    @Test
    public void it_should_robotic_rover_turn_left() {
        //given
        String commands = "LLL";
        //when
        String resultCoordinate = roboticRover.execute(commands);
        //then
        assertThat(resultCoordinate).isEqualTo("0 0 E");
    }

    @Test
    public void it_should_robotic_rover_move_up(){
        //given
        String commands = "MMM";
        //when
        String resultCoordinate = roboticRover.execute(commands);
        //then
        assertThat(resultCoordinate).isEqualTo("0 3 N");

    }

    @Test(expected = WrongCommandException.class)
    public void it_should_throw_exception_when_illegal_command() throws RuntimeException{
        //given
        String commands = "MXX";
        //when
        roboticRover.execute(commands);
    }

    @Test
    public void it_should_robotic_rover_skip_out_of_boundries_coordinate(){
        //given
        String commands = "LM";
        //when
        String resultCoordinate = roboticRover.execute(commands);
        //then
        assertThat(resultCoordinate).isEqualTo("0 0 W");

    }

    @Test
    public void it_should_move_right_and_left(){
        //given
        String commands = "RMLMRMMLM";
        //when
        String resultCoordinate = roboticRover.execute(commands);
        //then
        assertThat(resultCoordinate).isEqualTo("3 2 N");

    }

}

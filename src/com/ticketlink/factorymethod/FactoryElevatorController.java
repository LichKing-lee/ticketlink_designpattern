package com.ticketlink.factorymethod;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class FactoryElevatorController {
    private int id;
    private int curFloor = 1;
    private Motor motor;

    private static Direction getDirection(int destination, int curFloor){
        Direction direction;
        if(destination > curFloor){
            direction = Direction.UP;
        }else{
            direction = Direction.DOWN;
        }

        return direction;
    }

    public FactoryElevatorController(int id, Motor motor){
        this.id = id;
        this.motor = motor;
    }

    public void gotoFloor(int destination){
        if(destination == this.curFloor){ return; }

        Direction direction;

        direction = getDirection(destination, this.curFloor);

        motor.move(direction);

        System.out.println("Elevator [" + this.id + "] Floor: " + this.curFloor);
        this.curFloor = destination;
        System.out.println(" ==> " + this.curFloor + " with " + motor.getClass().getName());

        motor.stop();
    }
}

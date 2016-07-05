package com.ticketlink.factorymethod;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class Client {
    public static void main(String[] args){
        Motor lgMotor = new LGMotor();
        FactoryElevatorController controller1 = new FactoryElevatorController(1, lgMotor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        Motor hyundaiMotor = new HyundaiMotor();
        FactoryElevatorController controller2 = new FactoryElevatorController(2, hyundaiMotor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}

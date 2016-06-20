package com.ticketlink.strategy.after;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class Client {
    public static void main(String[] args){
        Robot robot = new Atom("atom");

        robot.setAttackable(new PunchStrategy());
        robot.attack();

        robot.setAttackable(new MissileStrategy());
        robot.attack();
    }
}

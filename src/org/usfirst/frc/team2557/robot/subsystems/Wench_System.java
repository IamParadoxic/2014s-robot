package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wench_System extends Subsystem {
	 
	double gp1RT = Robot.oi.gamepad1.getRawAxis(4); //hopefully this is the axis vaule for the Right Trigger
	double gp1LT = Robot.oi.gamepad1.getRawAxis(5); //hopefully this is the axis vaule for the Left Trigger
	
public void In(){
	if(gp1RT > 0 && gp1LT == 0){ //This, if it works how i think it will, will mean that if the Left trigger is held down while the Right trigger is, it won't do anything
	RobotMap.WenchMotor.set(1);
}
	else{
		RobotMap.WenchMotor.set(0);// when both triggers are either held dowm at the small or neither are being touched than nothin will happen
		
	}
}
public void Out(){
	if(gp1LT > 0 && gp1RT == 0){ //This, if it works how i think it will, will mean that if the Right trigger is held down while the Left trigger is, it won't do anything
	RobotMap.WenchMotor.set(-1);
}
	else{
	RobotMap.WenchMotor.set(0); // when both triggers are either held dowm at the small or neither are being touched than nothin will happen
	}
}
    public void initDefaultCommand() {
    	
    }
}


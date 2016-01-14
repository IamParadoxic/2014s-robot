package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wench_System extends Subsystem {
//	 
//	double gp1LT = Robot.oi.gamepad1.getRawAxis(2); //hopefully this is the axis vaule for the Right Trigger
//	double gp1RT = Robot.oi.gamepad1.getRawAxis(3); //hopefully this is the axis vaule for the Right Trigger
	//LT o to 1 RT 0 to -1 
	public void WenchMLR(){
		RobotMap.WenchMotor.set(Robot.oi.gamepad1.getRawAxis(2));
		RobotMap.WenchMotor.set(-Robot.oi.gamepad1.getRawAxis(3));
	}
    public void initDefaultCommand() {
    	
    }
}


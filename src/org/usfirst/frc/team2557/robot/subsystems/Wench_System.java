package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wench_System extends Subsystem {


	public void WenchMLR(){
		RobotMap.WenchMotor.set(Robot.oi.gamepad1.getRawAxis(2));
		RobotMap.WenchMotor.set(-Robot.oi.gamepad1.getRawAxis(3));
	}
    public void initDefaultCommand() {
    	
    }
}


package org.usfirst.frc.team2557.robot.subsystems;



import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Tank extends Subsystem {


    //Left side motors power being set
    public void Drive(){
    	RobotMap.FrontLeft.set(Robot.oi.gamepad1.getRawAxis(1));
		RobotMap.BackLeft.set(-Robot.oi.gamepad1.getRawAxis(1));
    	RobotMap.FrontRight.set(-Robot.oi.gamepad1.getRawAxis(5));
    	RobotMap.BackRight.set(-Robot.oi.gamepad1.getRawAxis(5));
    }
    public void initDefaultCommand() {
        
    }
}


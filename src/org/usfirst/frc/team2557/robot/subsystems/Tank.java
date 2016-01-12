package org.usfirst.frc.team2557.robot.subsystems;



import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Tank extends Subsystem {
/*  Setting a varible to equal the vaule of the 
    left/right  stick on the controller 1 joystick */
	double gp1yL = Robot.oi.gamepad1.getRawAxis(1); 
	double gp1yR = Robot.oi.gamepad1.getRawAxis(5);

    //Left side motors power being set
    public void LeftSide(){
    	RobotMap.FrontLeft.set(gp1yL);
		RobotMap.BackLeft.set(gp1yL);
    }

	//Right Side motors power being set
    public void RightSide(){
    	RobotMap.FrontRight.set(gp1yR);
    	RobotMap.BackRight.set(gp1yR);
    }
    public void initDefaultCommand() {
        
    }
}


package org.usfirst.frc.team2557.robot.subsystems;



//import org.usfirst.frc.team2557.robot.OI;
import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Tank extends Subsystem {


    //Left side motors power being set
    public void Drive(){
    	RobotMap.Drive.arcadeDrive(Robot.oi.gamepad1);
    }
    public void Forward(){
    	RobotMap.Drive.arcadeDrive(1, 0);
    }
    public void Backward(){
    	RobotMap.Drive.arcadeDrive(-1, 0);
    }
    
    public void initDefaultCommand() {
        
    }
}


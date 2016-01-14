package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

public class Intake_System extends Subsystem {
	
   
	public void In(){
    	RobotMap.IntakeMotor.set(1); //setting the motor speed for the intake
    }
    public void Out(){
    	RobotMap.IntakeMotor.set(-1); //setting the motor speed for the intake
    }
    public void Stop(){
    	RobotMap.IntakeMotor.set(0);
    }
    public void initDefaultCommand() {
        
    
    
    }
}


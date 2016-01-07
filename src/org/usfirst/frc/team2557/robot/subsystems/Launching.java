package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Launching extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void WenchDown(){
		if(RobotMap.WenchCoded.get() >= 0 && RobotMap.WenchCoded.get() > 8){
			RobotMap.WenchMotor.set(-1);
		}
		else if(RobotMap.WenchCoded.get() == 8){
			RobotMap.WenchSol.set(Value.kReverse);
		}
	}
	
	public void WenchLaunch(){
		if(RobotMap.WenchCoded.get() >= 8 && RobotMap.WenchCoded.get() > 16){
			RobotMap.WenchMotor.set(-1);
		}
		else if(RobotMap.WenchCoded.get() == 16){
			RobotMap.WenchSol.set(Value.kForward);
		}
	}
	
	
	
	public void initDefaultCommand() {
       
    }
}


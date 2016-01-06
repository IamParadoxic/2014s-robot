package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoid_System extends Subsystem {
	 public static DoubleSolenoid IntakeSol = RobotMap.IntakeSol;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void Down(){
		IntakeSol.set(Value.kReverse);
	}
	public void Up(){
		IntakeSol.set(Value.kForward);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


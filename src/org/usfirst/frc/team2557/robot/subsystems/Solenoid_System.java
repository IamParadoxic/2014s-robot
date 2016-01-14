package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoid_System extends Subsystem {
//	 public static DoubleSolenoid IntakeSol = RobotMap.IntakeSol;
//	 public static DoubleSolenoid WenchSol = RobotMap.WenchSol;
//	 public static DoubleSolenoid SuperShifterSol = RobotMap.SuperShifterSol;
//    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void Intake_Up(){
		RobotMap.IntakeSol.set(Value.kReverse);
	}
	public void Intake_Down(){
		RobotMap.IntakeSol.set(Value.kForward);
		
	}
	public void Wench_Lock(){
		RobotMap.WenchSol.set(Value.kReverse);
	}
	public void Wench_Unlock(){
		RobotMap.WenchSol.set(Value.kForward);
		
	}
	public void SS_Down(){
		RobotMap.SuperShifterSol.set(Value.kReverse);
	}
	public void SS_Up(){
		RobotMap.SuperShifterSol.set(Value.kForward);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


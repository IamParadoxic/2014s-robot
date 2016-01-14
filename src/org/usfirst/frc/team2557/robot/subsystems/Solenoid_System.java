package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoid_System extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void Intake_Up(){
		RobotMap.IntakeSol.set(Value.kReverse);
	}
	public void Intake_Down(){
		RobotMap.IntakeSol.set(Value.kForward);
		
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


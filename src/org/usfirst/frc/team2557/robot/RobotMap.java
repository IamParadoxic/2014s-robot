package org.usfirst.frc.team2557.robot;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
	
    public static SpeedController FrontLeft; 	//Port0
    public static SpeedController FrontRight; //Port1
    public static SpeedController BackLeft;	//Port2
    public static SpeedController BackRight;	//Port3
	public static SpeedController IntakeMotor;	//Port4
	public static SpeedController WenchMotor;	//Port5
	
	public static DoubleSolenoid IntakeSol; //Breakout 1 ports 2 and 3
    public static DoubleSolenoid WenchSol; //Breakout 1 ports 0 and 1
	public static DoubleSolenoid SuperShifterSol; //Breakout ports 4 and 5
	public static void init(){
    
    
    
	FrontLeft = new Talon(0);
	LiveWindow.addActuator("", "FrontLeft", (Talon) FrontLeft);
	
	FrontRight = new Talon(1);
	LiveWindow.addActuator("", "FrontRight", (Talon) FrontRight);
	
	BackLeft = new Talon(2);
	LiveWindow.addActuator("", "BackLeft", (Talon) BackLeft);
	
	BackRight = new Talon(3);
	LiveWindow.addActuator("", "BackRight", (Talon) BackRight);
    
	IntakeMotor = new Talon(4);
	
	WenchMotor = new Talon(5);
	
	WenchSol = new DoubleSolenoid(0, 0, 1);
	IntakeSol = new DoubleSolenoid(0, 2, 3);
	SuperShifterSol = new DoubleSolenoid(0, 4, 5);
    }
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}

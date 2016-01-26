package org.usfirst.frc.team2557.robot;
import edu.wpi.first.wpilibj.*;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static CANTalon 	FrontLeft = new CANTalon(4); 	//Port4
    public static CANTalon 	FrontRight = new CANTalon(5);	//Port5
    public static CANTalon 	BackLeft = new CANTalon(0);		//Port0
    public static CANTalon 	BackRight = new CANTalon(1);	//Port1
	public static CANTalon 	IntakeMotor = new CANTalon(3);	//Port3
	public static CANTalon 	WenchMotor = new CANTalon(2);	//Port2
	public static RobotDrive Drive = new RobotDrive(FrontLeft, BackLeft, FrontRight, BackRight);
	public static DoubleSolenoid IntakeSol = new DoubleSolenoid(0, 2, 3); //Breakout 1 ports 2 and 3
    public static DoubleSolenoid WenchSol = new DoubleSolenoid(0, 0, 1); //Breakout 1 ports 0 and 1
	public static DoubleSolenoid 	SuperShifterSol = new DoubleSolenoid(0, 4, 5); //Breakout ports 4 and 5
	
	public static Counter WenchCoded = new Counter(2);
	public static Counter Left = new Counter(4);
	public static Counter Right = new Counter(6);
	
	public static void init(){
    }
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}

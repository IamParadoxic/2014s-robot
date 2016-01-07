
package org.usfirst.frc.team2557.robot;

//import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team2557.robot.commands.*;
import org.usfirst.frc.team2557.robot.subsystems.Intake_System;
import org.usfirst.frc.team2557.robot.subsystems.Launching;
import org.usfirst.frc.team2557.robot.subsystems.Solenoid_System;
import org.usfirst.frc.team2557.robot.subsystems.Tank;
import org.usfirst.frc.team2557.robot.subsystems.Wench_System;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final Launching
	launching = new Launching();
	
	public static final Tank
	tank = new Tank();
	
	public static final Wench_System
	wench_system = new Wench_System();
	
	public static final Intake_System
	intake_system = new Intake_System();
	
	public static final Solenoid_System
	solenoid_system = new Solenoid_System();
	
	public static OI oi;
	public static Tank Tank;
    public static Intake_System Intake_System;
    public static Wench_System Wench_System;
    public static Solenoid_System Solenoid_System;
    public static Launching Launching;
    
    Command autonomousCommand;
    Command AutoCommand;
    Command LeftAndRight;
    Command Intake_In;
    Command Intake_Out;
    Command Intake_Up;
    Command Intake_Down;
    Command Wench_Command;
    Command Wench_Unlock;
    Command SS_Down;
    Command SS_Up;
    Command Launch;
    Command LaunchIt;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
        autonomousCommand = new AutoCommand();
        
        RobotMap.WenchCoded.reset();

        Intake_Up.start();
        //RobotMap.IntakeSol.set(Value.kReverse);
        Wench_Unlock.start();
        //RobotMap.WenchSol.set(Value.kForward);
        SS_Down.start();
        //RobotMap.SuperShifterSol.set(Value.kReverse);
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
       
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        Tank = new Tank();
        Intake_System = new Intake_System();
        Wench_System = new Wench_System();
        Solenoid_System = new Solenoid_System();
        Launching = new Launching();
        
        Launch = new Launch();
        LaunchIt = new LaunchIt();
        Intake_In = new Intake_In();
        Intake_Out = new Intake_Out();
        Intake_Up = new Intake_Up();
        Intake_Down = new Intake_Down();
        SS_Up = new SS_Up();
        SS_Down = new SS_Down();
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        LeftAndRight.start();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}

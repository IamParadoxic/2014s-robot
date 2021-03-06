
package org.usfirst.frc.team2557.robot;

//import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2557.robot.commands.*;
import org.usfirst.frc.team2557.robot.subsystems.Intake_System;
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

	
	public static OI oi;
	public static Tank Tank;
    public static Intake_System Intake_System;
    public static Wench_System Wench_System;
    public static Solenoid_System Solenoid_System;
    
    Command autonomousCommand;
    Command AutoCommand;
    Command Drive;
    Command Intake_In;
    Command Intake_Out;
    Command Intake_Up;
    Command Wench_Lock;
    Command Wench;
    Command SS_Down;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    public void robotInit() {
		
        // instantiate the command used for the autonomous period
        autonomousCommand = new AutoCommand();
        
        Tank = new Tank();
        Intake_System = new Intake_System();
        Wench_System = new Wench_System();
        Solenoid_System = new Solenoid_System();

        Wench_Lock = new Wench_Lock();
        Wench = new Wench();
        
        Intake_In = new Intake_In();
        Intake_Out = new Intake_Out();
        Intake_Up = new Intake_Up();
        SS_Down = new SS_Down();

        oi = new OI();
    


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
        SmartDashboard.putNumber("The Winch Encoder Value is", RobotMap.WenchCoded.get());
        Wench.start();
        Drive.start();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}

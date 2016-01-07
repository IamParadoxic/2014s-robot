package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Launch extends Command {
    double x = 8;
    public Launch() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.launching);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(RobotMap.WenchCoded.get() >= 0 && RobotMap.WenchCoded.get() > x){
    		Robot.launching.WenchDown();
    	}
    	else if(RobotMap.WenchCoded.get() >= x){
    		Robot.launching.WenchLaunch();
    		RobotMap.WenchCoded.reset();
    	}
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

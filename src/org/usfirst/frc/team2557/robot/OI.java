 package org.usfirst.frc.team2557.robot;

import org.usfirst.frc.team2557.robot.commands.Intake_In;
import org.usfirst.frc.team2557.robot.commands.Intake_Out;
import org.usfirst.frc.team2557.robot.commands.Intake_Up;
import org.usfirst.frc.team2557.robot.commands.Launch;
import org.usfirst.frc.team2557.robot.commands.LaunchIt;
import org.usfirst.frc.team2557.robot.commands.SS_Up;
import org.usfirst.frc.team2557.robot.commands.WenchCodeReset;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//Gamepads
	public Joystick gamepad1;
    public Joystick gamepad2;
    
    //Gamepad2
    public JoystickButton gp1A;
    public JoystickButton gp1B;
    public JoystickButton gp1X;
    public JoystickButton gp1Y;
    public JoystickButton gp1LB;
    public JoystickButton gp1RB;
    public JoystickButton gp1BACK;
    public JoystickButton gp1START;
    public JoystickButton gp1LJB;
    public JoystickButton gp1RJB;
//    public JoystickButton gp1XI;
//    public JoystickButton gp1XII;
    //Gamepad2
    public JoystickButton gp2A;
    public JoystickButton gp2B;
    public JoystickButton gp2X;
    public JoystickButton gp2Y;
    public JoystickButton gp2LB;
    public JoystickButton gp2RB;
    public JoystickButton gp2BACK;
    public JoystickButton gp2START;
    public JoystickButton gp2LJB;
    public JoystickButton gp2RJB;
//    public JoystickButton gp2XI;
//    public JoystickButton gp2XII;

    public OI() {
    //Gamepad ports
    gamepad1 = new Joystick(0);
    gamepad2 = new Joystick(1);
    //declaring Controller button assignments
    gp1A = new JoystickButton(gamepad1, 1);
    gp1B = new JoystickButton(gamepad1, 2);
    gp1X = new JoystickButton(gamepad1, 3);
    gp1Y = new JoystickButton(gamepad1, 4);
    gp1LB = new JoystickButton(gamepad1, 5);
    gp1RB = new JoystickButton(gamepad1, 6);
    gp1BACK = new JoystickButton(gamepad1, 7);
    gp1START = new JoystickButton(gamepad1, 8);
    gp1LJB = new JoystickButton(gamepad1, 9);
    gp1RJB = new JoystickButton(gamepad1, 10);
//    gp1XI = new JoystickButton(gamepad1, 11);
//    gp1XII = new JoystickButton(gamepad1, 12);
    
   //Declaring Controller 2's button assignments
    gp2A = new JoystickButton(gamepad2, 1);
    gp2B = new JoystickButton(gamepad2, 2);
    gp2X = new JoystickButton(gamepad2, 3);
    gp2Y = new JoystickButton(gamepad2, 4);
    gp2LB = new JoystickButton(gamepad2, 5);
    gp2RB = new JoystickButton(gamepad2, 6);
    gp2BACK = new JoystickButton(gamepad2, 7);
    gp2START = new JoystickButton(gamepad2, 8);
    gp2LJB = new JoystickButton(gamepad2, 9);
    gp2RJB = new JoystickButton(gamepad2, 10);
//    gp2XI = new JoystickButton(gamepad2, 11);
//    gp2XII = new JoystickButton(gamepad2, 12);

    //Controller 1 button functions
    
    //this should work as a one button toggle between two commnds, that is if it works how I want it to
    gp1A.toggleWhenPressed(new Intake_Up());

    gp1B.whenPressed(new Launch());
    gp1X.whenPressed(new LaunchIt());
    

    //this should work as a two button toggle, that is if it works how I want it to
    gp1Y.toggleWhenPressed(new SS_Up());
    //Intake Motor buttons, the wench motor is tied to the triggers buttons which are z axises
    gp1LB.whileHeld(new Intake_In());
    gp1RB.whileHeld(new Intake_Out());
    gp1BACK.whileHeld(new WenchCodeReset());
   
    //Controller 2 button functions none curently
    
    }
}
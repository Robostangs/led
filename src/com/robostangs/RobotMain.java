/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.robostangs;


import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotMain extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    private XboxController xbox;
    private DigitalOutput di1, di2, di3, di4;
    
    public void robotInit() {
	xbox = new XboxController(1);
	di1 = new DigitalOutput(1);
	di2 = new DigitalOutput(2);
	di3 = new DigitalOutput(3);
	di4 = new DigitalOutput(4);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
	if(xbox.aButton()) di1.set(true); else di1.set(false);
	if(xbox.bButton()) di2.set(true); else di2.set(false);
	if(xbox.xButton()) di3.set(true); else di3.set(false);
	if(xbox.yButton()) di4.set(true); else di4.set(false);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}

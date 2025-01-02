package frc.robot.subsystems;

import frc.robot.hardware.DrivatrainHardware;
import java.lang.Math;

public class Drivetrain {
    private IDrivetrainHardware; 

    public Drivetrain(IDrivetrainHardware hardware) {
        this.hardware = hardware; // Create Member Variable
    }

    private double capInput(double val, double min, double max) {
        if (val < min) {
            return min; 
        } if (val > max) {
            return max; 
        }
        return val; 
    }

    public void arcadeDrive

}
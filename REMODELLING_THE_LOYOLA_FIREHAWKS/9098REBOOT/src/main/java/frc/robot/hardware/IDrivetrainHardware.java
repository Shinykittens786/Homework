package frc.robot.hardware; 

public interface IDrivetrainHardware {
    public void setLeftSidePower(double input); 

    public void setRightSidePower(double input); 
    
    public double getEncoderRight(); 

    public double getEncoderLeft(); 

    public void resetEncoders(); 

    public void resetGyro(); 

    public double getGyroAngle(); 
}
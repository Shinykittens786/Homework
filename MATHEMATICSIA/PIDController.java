/*

Implement the DoubleIntegrator simulation. You will need to keep track of position and 
velocity and acceleration will be the input

Implement a PIDController class. Look at the PID from the 2024 FRC code. Understand it 

Write out code to write out the positions/velocities as well as input 
(for whichever system ur simulation) to a CSV file */

/*package frc.robot.autonomous;

public class PIDController {

  public final double kP;
  public final double kI;
  public final double kD;
  public double target, currentError, lastError, outputMax, outputMin, current, errorSum;
  public double integralRange = 10;
  
  public PIDController(double currentSensorReading, double target, double outputMin, double outputMax, double kP, double kI, double kD) {
    this.kP = kP;
    this.kI = kI;
    this.kD = kD;
    this.target = target;
    this.outputMax = outputMax;
    this.outputMin = outputMin;
    this.lastError = 0;
    this.currentError = target - currentSensorReading;
  }
  public double getOutput() {
    return capOutput(currentError*kP + ((currentError-lastError)*kD) + (errorSum * kI));
  }
  public double capOutput(double val) {
    // caps the output value by using if else loops
    if (return val >= outputMax) {
     outputMax = val < outputMin
    } else { 
    outputMin = val;
    }
  public void updateError(double currentSensorReading) {
    // updating the error
    lastError = currentError;
    currentError = target - currentSensorReading;
    if (errorSum += Math.abs(currentError) < integralRange) {
     currentError = 0;
  }
}
*/

public class PIDController {
    public final double kP;
    public final double kI;
    public final double kD; 
    public double setpoint;
    public double currentPosition; 
    double currentError = 0; 
    double lastError = 0; 
    double errorSum = 0; 
    double timeStep; 
    double integralRange = 10; 
    public PIDController (double kP, double kI, double kD, double setpoint, double position, double timeStep) {
        this.kP = kP; 
        this.kD = kD; 
        this.kI = kI;
        this.setpoint = setpoint;
        this.currentPosition = position;
        this.timeStep = timeStep;   
    }
    
    public double getCurrentError() {
        currentError = setpoint - currentPosition;
        return currentError;
    }

    public void updateError(double currentPosition) {
      // updating the error
      lastError = currentError;
      currentError = currentPosition - setpoint;
      if (Math.abs(errorSum) < integralRange) {
        errorSum += currentError * timeStep;
    }
  }

    public double getOutput() {
        return (currentError*kP) + ((currentError - lastError) * kD) + (errorSum * kI); 
    }

}
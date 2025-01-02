package frc.robot.hardware; 

import frc.robot.RobotMap;     
import edu.wpi.first.wpilibj.SPI;
import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.REVLibError;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.can.TalonSRX; 
import com.ctre.phoenix.sensors.CANCoder; 

public class RollerIntakeHardware implements IRollerIntakeHarware {
    private TalonSRX armPivot1;
    private TalonSRX armPivot2; 
    private CANSparkMax rollerIntake;

    public RollerIntakeHardware() {
        armPivot1 = new TalonSRX(RobotMap.ARM_PIVOT_CAN_ID, MotorType.kBrushed);
        armPivot2 = new TalonSRX(RobotMap.ARM_PIVOT_TWO_CAN_ID, MotorType.kBrushed);
        rollerIntake = new CANSparkMax(RobotMap.ROLLER_INTK_CAN_ID, MotorType.kBrushless);
        Encoder armEncoder = new Encoder(0, 1); 
        // Initializes an encoder on DIO pins 0 and 1
        // Defaults to 4X decoding and non-inverted
        // To change the decoding to 1X or 2X, use:  (0, 1, false, Encoder.EncodingType.k2X);
    }

    public void setArmIntakePower(double val) {
        armPivot1.set(val);
        armPivot2.set(val); 
    }

    public double getArmIntakePosition() {
        armEncoder.getDistance();
    }

    public void setRollerIntakePower(double val) {
        rollerIntake.set(val); 
    }

    public void zeroArmIntakeEncoders() {
        armEncoder.reset(); 
    }
}
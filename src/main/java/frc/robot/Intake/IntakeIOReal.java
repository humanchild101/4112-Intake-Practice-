package frc.robot.Intake;

import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import au.grapplerobotics.LaserCan;
import frc.robot.Intake.IntakeConstants.IntakePositions;

public class IntakeIOReal implements IntakeIO{
    public final TalonFX raiserMotor, indexerMotor;
    public final LaserCan laserCan;

    private final MotionMagicVoltage raiserOut = new MotionMagicVoltage(0);


    public IntakeIOReal(){
        raiserMotor = new TalonFX(0);
        indexerMotor = new TalonFX(1);
        laserCan = new LaserCan(2);


        
    }
    @Override
    public void resetState() {
        raiserMotor.setPosition(IntakePositions.Up.val);
    }
    @Override
    public void setIndexerVoltage(double val) {
        indexerMotor.setVoltage(val);
        
    }
    @Override
    public void setRaiserClosedLoop(double val) {
        raiserMotor.setControl(raiserOut.withPosition(val));
    }
    @Override
    public void setRaiserOpenLoop(double val) {
        raiserMotor.setVoltage(val);
    }

    @Override
    public void setRaiserVoltage(double val) {
       raiserMotor.setVoltage(val);
    }
    @Override
    public void updateInputs(IntakeIOInputs io) {
        
    }
    
}

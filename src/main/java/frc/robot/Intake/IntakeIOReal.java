package frc.robot.Intake;

import com.ctre.phoenix6.hardware.TalonFX;

import au.grapplerobotics.LaserCan;

public class IntakeIOReal implements IntakeIO{
    public final TalonFX raiserMotor, indexerMotor;
    public final LaserCan laserCan;


    public IntakeIOReal(){
        raiserMotor = new TalonFX(0);
        indexerMotor = new TalonFX(1);
        laserCan = new LaserCan(2);


        
    }
    @Override
    public void resetState() {
        
    }
    @Override
    public void setIndexerVoltage() {
        
    }
    @Override
    public void setRaiserClosedLoop() {
     
    }
    @Override
    public void setRaiserOpenLoop() {
    }

    @Override
    public void setRaiserVoltage() {
       
    }
    @Override
    public void updateInputs(IntakeIOInputs io) {
        
    }
    
}

package frc.robot.Intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Intake.IntakeConstants.IntakePositions;
import frc.robot.Intake.IntakeIO.IntakeIOInputs;

public class Intake extends SubsystemBase{
    private final IntakeIO io;
    private final IntakeIOInputs inputs = new IntakeIOInputs();
    


    public Intake(IntakeIO io){
        this.io = io;
        

        
    }
    
    
    @Override
    public void periodic() {
        
    }
    public void setIntakePos(){

    }
    public void switchPosition(){

    }
    public void setCollectorVoltage(){

    }
    public boolean isUp(){
        return false;
    }
    public boolean isAtPosition(IntakePositions pos){
        return Math.abs()
    }
    public boolean isFree(){
        return false;
    }
    
}
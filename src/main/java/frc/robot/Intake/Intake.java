package frc.robot.Intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{
    private final IntakeIO io;
    


    public Intake(IntakeIO io){
        this.io = io;

        
    }
    
    
    @Override
    public void periodic() {
        
    }
    public void setIntakePos(){

    }
    public void setCollectorVoltage(){

    }
    public boolean isUp(){
        return false;
    }
    public boolean isAtPosition(){
        return false;
    }
    public boolean isFree(){
        return false;
    }
    
}
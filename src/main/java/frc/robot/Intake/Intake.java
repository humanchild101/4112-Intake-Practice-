package frc.robot.Intake;
import static edu.wpi.first.units.Units.Degrees;
import static edu.wpi.first.units.Units.Rotations;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Intake.IntakeConstants.IntakePositions;
import frc.robot.Intake.IntakeIO.IntakeIOInputs;

public class Intake extends SubsystemBase{
    private final IntakeIO io;
    private final IntakeIOInputs inputs = new IntakeIOInputs();
    

    public IntakePositions targetPosition;
    public Intake(IntakeIO io){
        this.io = io;
        
        

        
    }
    
    
    @Override
    public void periodic() {
        io.updateInputs(inputs);
    }
    public void setIntakePos(IntakePositions pos){
        io.setRaiserClosedLoop(Rotations.convertFrom(pos.val, Degrees));
        
    }
    public void switchPosition(){
        if (targetPosition == IntakePositions.Up){
            targetPosition = IntakePositions.Down;
        }
        else{
            targetPosition = IntakePositions.Up;
        }
    }
    public void setCollectorVoltage(double val){
        io.setIndexerVoltage(val);
    }
    public boolean isUp(){
        return isAtPosition(IntakePositions.Up);
    }
    public boolean isAtPosition(IntakePositions pos){
        return Math.abs(inputs.raiserPosition - pos.val) < IntakeConstants.IntakeMargin;
    }
    public boolean isFree(){
        return false;
    }
    public IntakePositions getTargetPosition(){
        return targetPosition;
    }
    
}
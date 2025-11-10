
public class IntakeIOReal implements IntakeIO{

    public IntakeIOReal(){

    }
    
    @Override
    public void updateInputs(){
        var elev1Status = BaseStatusSignal.refreshAll(elevVol, elevPos, elevVel, elevCur);

    }

    @Override
    public void setIntakeClosedLoop(double pos){ 

    }

    @Override
    public void setIntakeOpenLoop(double volts){
    }

    @Override
    public void resetState() {
    }

    @Override
    public void stopIntake(){
    }
}

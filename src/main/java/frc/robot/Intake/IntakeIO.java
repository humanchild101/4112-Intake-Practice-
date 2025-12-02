package frc.robot.Intake;

public interface IntakeIO {


    public static class IntakeIOInputs{
        public boolean raiserConnected = false;
        public boolean indexerConnected = false;
        public double indexerVoltage = 0;
        public double raiserVoltage = 0;
        public double raiserPosition = 0;
    }

    public default void setIndexerVoltage(double val){

    }
    public default void setRaiserVoltage(double val){

    }

    public default void setRaiserClosedLoop(double val){
        

    }
    public default void setRaiserOpenLoop(double val){

    }
   

    public default void resetState(){

    }
    public default void updateInputs(IntakeIOInputs io){
        //the inputs that i definitely have
    }

    
    


}

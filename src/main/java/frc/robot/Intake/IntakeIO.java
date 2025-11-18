package frc.robot.Intake;

public interface IntakeIO {


    public static class IntakeIOInputs{
        public boolean raiserConnected = false;
        public boolean indexerConnected = false;
        public double indexerVoltage = 0;
        public double raiserVoltage = 0;
        
    }

    public default void setIndexerVoltage(){

    }
    public default void setRaiserVoltage(){

    }

    public default void setRaiserClosedLoop(){

    }
    public default void setRaiserOpenLoop(){

    }
   

    public default void resetState(){

    }
    public default void updateInputs(IntakeIOInputs io){
        //the inputs that i definitely have
    }

    
    


}

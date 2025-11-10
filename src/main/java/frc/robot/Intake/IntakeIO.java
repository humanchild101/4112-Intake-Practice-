

public interface IntakeIO{
    @AutoLog
    public static class IntakeIOInputs{


    }

    public default void updateInputs(){}

    public default void setIntakeClosedLoop(){}
    
    public default void setIntakeOpenLoop(){}

    public default void stopIntake(){} 

	public default void resetState(){} 
}
   

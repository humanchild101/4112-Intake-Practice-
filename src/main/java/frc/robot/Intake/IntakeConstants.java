
public class ElevatorConstants {
    public enum ElevatorPosition {
        M1START(0.0),
        M1HOLD(0.0),
        M1ROTATE(0.0),
        M2START(0.0),
        M2HOLD(0.0),
        M2ROTATE(0.0),
       

        public final double value;
        private MotorOnePosition(double value){
            this.value = value;
         }

        private MotorTwoPosition(double value){
            this.value = value;
         }
    }


    


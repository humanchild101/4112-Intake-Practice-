package frc.robot.Intake;



public class IntakeConstants{
    public enum IntakePositions{
        Down(135),
        Up(-20);

        public final double val;

        private IntakePositions(double val){
            this.val = val;
        }
    }

    

}
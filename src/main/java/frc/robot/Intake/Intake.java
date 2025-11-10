public class Intake extends SubsystemBase {
    private final Alert elev1DisconnectedAlert, elev2DisconnectedAlert;
    @AutoLogOutput

    private final SysIdRoutine sysId;

    public Intake(IntakeIO io){

    }

    public void periodic(){

    }

    public void setPosition(){

    }

    public void setRotation(){

    }

    @AutoLogOutput
    public boolean isAtPosition() {

    }

    public boolean isAtPosition(ElevatorPosition position) {

    }

    public boolean hasCoral() {

    }



    @AutoLogOutput
    public boolean isFree() {
    }

    @AutoLogOutput
    public String current() {
        return this.getCurrentCommand() != null ? this.getCurrentCommand().getName() : "NONE";
    }



    public void runCharacterization(double volts) {
        elevatorIO.setElevatorOpenLoop(volts);
    }

    /** Returns a command to run a dynamic test in the specified direction. */
    public Command sysIdQuasistatic(SysIdRoutine.Direction direction) {
        return run(() -> runCharacterization(0.0)).withTimeout(1.0).andThen(sysId.quasistatic(direction));
    }

    /** Returns a command to run a dynamic test in the specified direction. */
    public Command sysIdDynamic(SysIdRoutine.Direction direction) {
        return run(() -> runCharacterization(0.0)).withTimeout(1.0).andThen(sysId.dynamic(direction));
    }

    public void resetState() {

    }
}

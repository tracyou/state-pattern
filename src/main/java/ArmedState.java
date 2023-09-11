public class ArmedState implements State {
    AircraftDoor aircraftDoor;

    public ArmedState(AircraftDoor aircraftDoor) {
        this.aircraftDoor = aircraftDoor;
    }

    @Override
    public String lockDoor() {
        aircraftDoor.setState(aircraftDoor.getLockedState());
        return Messages.LOCKED_STATE_MESSAGE;
    }

    @Override
    public String closeDoor() {
        aircraftDoor.setState(aircraftDoor.getClosedState());
        return Messages.CLOSED_STATE_MESSAGE;
    }

    @Override
    public String openDoor() {
        aircraftDoor.setState(aircraftDoor.slideDeployedState);
        return Messages.SLIDE_DEPLOYED;
    }

    @Override
    public String armDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String toString() {
        return Messages.ARMED_STATE_MESSAGE;
    }
}

public class OpenState implements State {
    AircraftDoor aircraftDoor;

    public OpenState(AircraftDoor aircraftDoor) {
        this.aircraftDoor = aircraftDoor;
    }

    @Override
    public String lockDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String closeDoor() {
        aircraftDoor.setState(aircraftDoor.getClosedState());
        return Messages.CLOSED_STATE_MESSAGE;
    }

    @Override
    public String openDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String armDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String toString() {
        return Messages.OPEN_STATE_MESSAGE;
    }
}

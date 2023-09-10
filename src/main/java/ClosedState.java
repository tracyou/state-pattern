public class ClosedState implements State {

    AircraftDoor aircraftDoor;

    public ClosedState(AircraftDoor aircraftDoor) {
        this.aircraftDoor = aircraftDoor;
    }

    @Override
    public String lockDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String closeDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String openDoor() {
        aircraftDoor.setState(aircraftDoor.getOpenState());
        return Messages.OPEN_STATE_MESSAGE;
    }

    @Override
    public String armDoor() {
        aircraftDoor.setState(aircraftDoor.getArmedState());
        return Messages.ARMED_STATE_MESSAGE;
    }

    @Override
    public String toString() {
        return Messages.CLOSED_STATE_MESSAGE;
    }
}

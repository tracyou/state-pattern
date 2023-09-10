public class AircraftDoor {
    State armedState;
    State closedState;
    State lockedState;
    State openState;

    State slideDeployedState;
    State state;
    String name;

    public AircraftDoor(String name) {
        this.name = name;
        this.armedState = new ArmedState(this);
        this.closedState = new ClosedState(this);
        this.lockedState = new LockedState(this);
        this.openState = new OpenState(this);
        this.slideDeployedState = new SlideDeployedState();
        this.state = new OpenState(this);
    }

    public String getName() {
        return name;
    }

    public String closeDoor() {
        return state.closeDoor();
    }


    public String armDoor() {
        return state.armDoor();
    }

    public String lockDoor() {
        return state.lockDoor();
    }

    public String openDoor() {
        return state.openDoor();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getOpenState() {
        return openState;
    }

    public State getClosedState() {
        return closedState;
    }

    public State getArmedState() {
        return armedState;
    }

    public State getLockedState() {
        return lockedState;
    }

    public State getDeployedState() {
        return slideDeployedState;
    }
}

public class SlideDeployedState implements State {
    @Override
    public String lockDoor() {
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String closeDoor() {
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String openDoor() {
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String armDoor() {
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String toString() {
        return Messages.SLIDE_DEPLOYED;
    }
}

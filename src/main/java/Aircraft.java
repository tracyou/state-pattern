public class Aircraft {
    private AircraftDoor cabinDoor1;
    private String type;

    public Aircraft(String type) {
        this.type = type;
        cabinDoor1 = new AircraftDoor("Cabin Door 1");
    }

    public AircraftDoor getCabinDoor1() {
        return cabinDoor1;
    }

    @Override
    public String toString() {
        return "Aircraft: " + type+ ": "+cabinDoor1;

    }
}

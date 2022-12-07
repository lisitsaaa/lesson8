package Hospital;

public class HouseSurgeon extends Doctor {
    private final Position position;
    public HouseSurgeon() {
        this.position = Position.HOUSE_SURGEON;
    }

    @Override
    public void doWork() {
        System.out.println(position + " is working");
    }
}

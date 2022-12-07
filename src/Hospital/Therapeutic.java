package Hospital;

public class Therapeutic extends Doctor{

    private final Position position ;
    public Therapeutic() {
        this.position = Position.THERAPEUTIC;
    }

    @Override
    public void doWork() {
        System.out.println(position + " is working");
    }
}

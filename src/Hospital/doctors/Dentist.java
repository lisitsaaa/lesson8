package Hospital.doctors;

public class Dentist extends Doctor {
    private final Position position;
    public Dentist() {
        this.position = Position.DENTIST;
    }

    @Override
    public void doWork() {
        System.out.println(position + " is working");
    }
}

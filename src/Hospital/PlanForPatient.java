package Hospital;

import Hospital.doctors.Position;

public class PlanForPatient {
    private Position position;

    public PlanForPatient(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "You need to visit " + position ;
    }
}
package Hospital;

import Hospital.doctors.Position;

public class PlanForPatient {
    Position position;

    public PlanForPatient(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "You need to visit " + position ;
    }
}

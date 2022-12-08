package Hospital;

import Hospital.doctors.Position;

public class PlanForPatient {
    private final int kod;
    private Position position;

    public PlanForPatient(int kod) {
        this.kod = kod;
    }

    public Position workWithKod() {
        switch (kod) {
            case 1 -> {
                position = Position.HOUSE_SURGEON;
            }
            case 2 -> {
                position = Position.DENTIST;
            }
            case 3 -> {
                position = Position.THERAPEUTIC;
            }
        }
        return position;
    }

    @Override
    public String toString() {
        return "You need to visit " + position ;
    }
}
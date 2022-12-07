package Hospital;

import Hospital.doctors.Dentist;
import Hospital.doctors.HouseSurgeon;
import Hospital.doctors.Position;
import Hospital.doctors.Therapeutic;

public class PlanForPatient {
    Position position;

    public PlanForPatient() {
        //this.position = position;
    }

    public void chooseDoctor(Position position) {
        switch (position) {
            case HOUSE_SURGEON -> {
                System.out.println(position);
            }
            case DENTIST -> {
                System.out.println(position);
            }
            case THERAPEUTIC -> {
                System.out.println(position);
            }
        }
    }

    @Override
    public String toString() {
        return "You need to visit " + position ;
    }
}
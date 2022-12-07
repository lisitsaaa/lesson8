package Hospital;

import Hospital.doctors.Dentist;
import Hospital.doctors.HouseSurgeon;
import Hospital.doctors.Position;
import Hospital.doctors.Therapeutic;

public class Patient {
    private PlanForPatient plan;

    public Patient(Position position) {
        this.plan = new PlanForPatient(position);
    }

    public void chooseDoctor(Position position) {
        switch (position) {
            case HOUSE_SURGEON -> {
                HouseSurgeon hs1 = new HouseSurgeon();
                System.out.println(plan);
                hs1.doWork();
            }
            case DENTIST -> {
                Dentist d1 = new Dentist();
                System.out.println(plan);
                d1.doWork();
            }
            case THERAPEUTIC -> {
                Therapeutic t1 = new Therapeutic();
                System.out.println(plan);
                t1.doWork();
            }
        }
    }
}

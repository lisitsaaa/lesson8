package Hospital;

import Hospital.doctors.Dentist;
import Hospital.doctors.HouseSurgeon;
import Hospital.doctors.Position;
import Hospital.doctors.Therapeutic;

public class Patient {
    private final PlanForPatient plan;

    public Patient(Position position) {
        this.plan = new PlanForPatient(position);
    }

    public void chooseDoctor() {
        switch (plan.getPosition()) {
            case HOUSE_SURGEON -> {
                System.out.println(plan);
                HouseSurgeon hs1 = new HouseSurgeon();
                hs1.doWork();
            }
            case DENTIST -> {
                System.out.println(plan);
                Dentist d1 = new Dentist();
                d1.doWork();
            }
            case THERAPEUTIC -> {
                System.out.println(plan);
                Therapeutic t1 = new Therapeutic();
                t1.doWork();
            }
        }
    }
}
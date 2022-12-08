package Hospital;

import Hospital.doctors.Dentist;
import Hospital.doctors.HouseSurgeon;
import Hospital.doctors.Therapeutic;

public class Patient {
    private final PlanForPatient plan;

    public Patient(int kod) {
        this.plan = new PlanForPatient(kod);
    }

    public void chooseDoctor() {
        switch (plan.workWithKod()) {
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
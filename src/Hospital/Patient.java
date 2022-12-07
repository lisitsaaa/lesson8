package Hospital;

import Hospital.doctors.Dentist;
import Hospital.doctors.HouseSurgeon;
import Hospital.doctors.Position;
import Hospital.doctors.Therapeutic;

public class Patient {
    private PlanForPatient plan;

    public Patient() {
        this.plan = new PlanForPatient();
    }

    public void chooseHouseSurgeon(Position position) {
        plan.chooseDoctor(position);

        HouseSurgeon hs1 = new HouseSurgeon();
        hs1.doWork();
    }

    public void chooseDentist(Position position) {
        plan.chooseDoctor(position);
        Dentist d1 = new Dentist();
        d1.doWork();
    }

    public void chooseTherapeutic(Position position) {
        plan.chooseDoctor(position);
        Therapeutic t1 = new Therapeutic();
        t1.doWork();
    }


}
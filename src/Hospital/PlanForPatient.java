package Hospital;

public class PlanForPatient {
    public void chooseDoctor(Position position) {
        if (position == Position.HOUSE_SURGEON) {
            HouseSurgeon hs1 = new HouseSurgeon();
            hs1.doWork();

        } else if (position == Position.DENTIST) {
            Dentist d1 = new Dentist();
            d1.doWork();
        } else {
            Therapeutic t1 = new Therapeutic();
            t1.doWork();
        }
    }
}

package Hospital;

import Hospital.doctors.Position;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.chooseHouseSurgeon(Position.HOUSE_SURGEON);
        System.out.println();

        Patient p2 = new Patient();
        p2.chooseDentist(Position.DENTIST);
        System.out.println();

        Patient p3 = new Patient();
        p3.chooseDentist(Position.THERAPEUTIC);

    }
}
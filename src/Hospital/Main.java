package Hospital;

import Hospital.doctors.Position;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(Position.HOUSE_SURGEON);
        System.out.println(p1);
        p1.blank();
        System.out.println();

        Patient p2 = new Patient(Position.DENTIST);
        System.out.println(p2);
        p2.blank();
        System.out.println();

        Patient p3 = new Patient(Position.THERAPEUTIC);
        System.out.println(p3);
        p3.blank();

    }
}

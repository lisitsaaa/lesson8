package Hospital;

import Hospital.doctors.Position;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(Position.HOUSE_SURGEON);
        p1.chooseDoctor(Position.HOUSE_SURGEON);
        System.out.println();

        Patient p2 = new Patient(Position.DENTIST);
        p2.chooseDoctor(Position.DENTIST);
        System.out.println();

        Patient p3 = new Patient(Position.THERAPEUTIC);
        p3.chooseDoctor(Position.THERAPEUTIC);

    }
}

package Hospital;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(1);
        p1.chooseDoctor();
        System.out.println();

        Patient p2 = new Patient(2);
        p2.chooseDoctor();
        System.out.println();

        Patient p3 = new Patient(3);
        p3.chooseDoctor();

    }
}
package Hospital;

import Hospital.doctors.Position;

public class Patient {
    Position position;

    public Patient(Position position){
        this.position = position;
    }

    public void blank(){
        PlanForPatient p1 = new PlanForPatient();
        p1.chooseDoctor(position);
    }

    @Override
    public String toString() {
        return "You need to visit a " + position;
    }
}

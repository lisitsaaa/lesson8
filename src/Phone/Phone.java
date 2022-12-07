package Phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
        this.number = "+375 29 18-92-123";
        this.model = "Samsung";
        this.weight = 273;

    }

    public Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String receiveCall(String name) {
        System.out.println("call " + name +
                " number -> " + getNumber());

        return getNumber();
    }

    public void receiveCall(String name, String number) {
        System.out.println("call " + name +
                " number -> " + number);
    }

    public void sendMessage(String... number) {
        System.out.println(Arrays.deepToString(number) + " -> send you message\n");
    }

    @Override
    public String toString() {
        return "phone: " +
                "number = " + number +
                ", model = " + model +
                ", weight = " + weight;
    }
}

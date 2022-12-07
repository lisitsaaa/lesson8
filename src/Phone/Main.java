package Phone;

public class Main {
    public static void main(String[] args) {
        Phone ph1 = new Phone();
        Phone ph2 = new Phone("+375 33 81-22-146", "Xiaomi");
        Phone ph3 = new Phone("+375 44 75-12-398", "Iphone", 212);
        Phone ph4 = new Phone();

        ph4.setNumber("+375 29 98-23-376");
        ph4.setModel("Toshiba");
        ph4.setWeight(402);

        System.out.println(ph1);
        System.out.println(ph2);
        System.out.println(ph3);
        System.out.println(ph4);
        System.out.println();

        ph1.receiveCall("Olga");
        ph1.receiveCall("Kate", "+375 44 79-91-098");
        ph1.sendMessage("+375 44 34-05-923", "+375 33 81-82-567");

        ph2.receiveCall("Victor");
        ph2.receiveCall("Anatoliy", "+375 29 876-23-54");

        ph2.sendMessage("+375 44 21-67-233");

        ph3.receiveCall("Misha");
        ph3.receiveCall("Nikolay", "+375 33 97-19-504");

        ph3.sendMessage("+375 44 34-05-923", "+375 33 81-22-146", "+375 29 79-91-098");

        ph4.receiveCall("Maxim");
        ph4.receiveCall("Oksana", "+375 29 87-23-708");

        ph4.sendMessage("+375 33 81-22-146", "+375 44 75-12-398", "+375 33 97-19-504");


    }
}

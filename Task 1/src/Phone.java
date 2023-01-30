public class Phone {
    static String phoneManufacturerCountry;

    long number;
    String phoneModel;
    double weight;

    public Phone() {

    }

    public Phone(long number, String phoneModel, double weight) {
        this.number = number;
        this.phoneModel = phoneModel;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        receiveCall(name, 0);
    }

    public void receiveCall(String name, long number) {
        System.out.println("Звонит абонент по имени " + name + (number == 0 ? 0 : " номер " + number));
    }
}

public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone();
        phoneOne.phoneModel = "Samsung";
        phoneOne.weight = 89.5;
        phoneOne.number = 897786988;

        Phone phoneTwo = new Phone(345768, "Iphone", 100.0);
        Phone.phoneManufacturerCountry = "China";

        System.out.println(phoneOne.number);
        System.out.println(phoneTwo.phoneModel);
        System.out.println(phoneOne.phoneManufacturerCountry);
        System.out.println(phoneTwo.phoneManufacturerCountry);

        phoneOne.receiveCall("Timon");
        phoneTwo.receiveCall("Pumba", 9876543);

    }
}

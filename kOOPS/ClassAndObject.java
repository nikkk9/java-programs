class Laptop {
    String name;
    int price;

    public void coding() {
        System.out.println("java is best for dsa");
    }

    // public void printName() {
    // System.out.println(this.name);
    // }

    // public void printPrice() {
    // System.out.println(this.price);
    // }

    public void lapInfo() {
        System.out.println(this.name);
        System.out.println(this.price);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Laptop() is a Constructor
        Laptop lap1 = new Laptop();
        Laptop lap2 = new Laptop();

        lap1.name = "asus";
        lap1.price = 30000;
        lap2.name = "hp";
        lap2.price = 40000;

        lap1.coding();
        lap1.lapInfo();
        lap2.lapInfo();

    }

}

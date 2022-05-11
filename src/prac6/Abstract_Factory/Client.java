package prac6.Abstract_Factory;

public class Client {
    private final Car sedan;

    public Client(CarFactory factory) {
        sedan = factory.sedan();
    }

    public void print() {
        sedan.printType();
    }
}

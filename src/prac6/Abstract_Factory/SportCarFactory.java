package prac6.Abstract_Factory;

public class SportCarFactory implements CarFactory {
    @Override
    public Car sedan() {
        return new SportSedan();
    }
}
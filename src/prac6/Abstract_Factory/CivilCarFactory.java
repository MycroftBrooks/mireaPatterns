package prac6.Abstract_Factory;

public class CivilCarFactory implements CarFactory{
    @Override
    public Car sedan() {
        return new Sedan();
    }
}

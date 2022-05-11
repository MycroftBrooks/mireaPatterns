package prac6.Builder;

public class CarBuilder implements Builder{

    Car car = new Car();

    @Override
    public void setEngine(String engine) {
        car.buildEngine(engine);
    }

    @Override
    public void setName(String name) {
        car.setName(name);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
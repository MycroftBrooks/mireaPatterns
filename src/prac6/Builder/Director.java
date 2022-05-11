package prac6.Builder;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructSportCar() {
        builder.setEngine("Turbo");
        builder.setName("Ferrari");
    }
}

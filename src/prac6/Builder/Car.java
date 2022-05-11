package prac6.Builder;

public class Car {
    private String engine;
    private String name;

    public void buildEngine(String engine) {
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name + " with " + engine);
    }

}

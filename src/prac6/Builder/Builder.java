package prac6.Builder;

public interface Builder {
    void setEngine(String engine);
    void setName(String name);
    Car getResult();
}
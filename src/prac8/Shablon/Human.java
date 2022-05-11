package prac8.Shablon;
public abstract class Human {
    abstract public void sitChair();
    abstract public void standChair();

    public void chair() {
        sitChair();
        standChair();
    }
}
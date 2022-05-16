package prac8.Shablon; //определяет основу алгоритма и позволяющий наследникам переопределять некоторые шаги алгоритма, не изменяя его структуру в целом.

public class OneHuman extends Human {
    @Override
    public void sitChair() {
        System.out.println("Sit on chair");
    }

    @Override
    public void standChair() {
        System.out.println("Stand on chair");
    }
}
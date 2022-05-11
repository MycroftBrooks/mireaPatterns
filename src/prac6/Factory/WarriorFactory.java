package prac6.Factory;

public class WarriorFactory implements Factory {
    @Override
    public Enemy enemyFactory(){
        return new Warrior();
    }
}

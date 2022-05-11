package prac6;


import prac6.Builder.Builder;
import prac6.Builder.Car;
import prac6.Builder.CarBuilder;
import prac6.Builder.Director;
import prac6.Factory.*;
import prac6.Abstract_Factory.CarFactory;
import prac6.Abstract_Factory.CivilCarFactory;
import prac6.Abstract_Factory.SportCarFactory;
import prac6.Prototype.Circle;
import prac6.Prototype.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        factory();
        abstract_factory();
        builder();
        prototype();
    }

    public static void factory() {
        Factory[] enemyMaker = {new WarriorFactory()};
        for (Factory factory : enemyMaker) {
            Enemy enemy = factory.enemyFactory();
            enemy.printEnemyClass();
        }
    }
    public static void abstract_factory(){
        CarFactory[] carFactories = {new CivilCarFactory(), new SportCarFactory()};
        for (CarFactory factory : carFactories) {
            prac6.Abstract_Factory.Car sedan = factory.sedan();
            sedan.printType();
        }
    }
    public static void builder(){
        Builder builder = new CarBuilder();
        Director director = new Director(builder);

        director.constructSportCar();
        Car sportCar = builder.getResult();
        sportCar.print();
    }
    public static void prototype(){
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(25);
        circle.setRadius(20);
        List<Shape> shapes = Arrays.asList(circle);
        List<Shape> shapesClone = new ArrayList<>();
        for (Shape shape : shapes) {
            shapesClone.add(shape.clone());
        }
        System.out.println("Исходный массив: " + shapes);
        System.out.println("Скопированный массив: " + shapesClone);
    }
}



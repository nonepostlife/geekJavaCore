package ru.postlife.oop;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person person = Person.createBuilder()
                .withFirstName("Mary")
                .withLastName("White")
                .withAge(25)
                .withCountry("USA")
                .withGender("woman")
                .build();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());

        List<Car> cars = new ArrayList<>();
        cars.add(new LightWeightCar(new Engine(), "red", "Toyota Prius"));
        cars.add(new Lorry(new Engine(), "black", "Камаз"));
        cars.forEach(car -> {
            car.open();
            car.move();
            car.stop();
        });

        List<Shape> figures = new ArrayList<>();
        figures.add(new Triangle());
        figures.add(new Circle());
        figures.add(new Square());
        figures.forEach(Shape::draw);
    }
}

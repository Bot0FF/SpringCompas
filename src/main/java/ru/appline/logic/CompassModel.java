package ru.appline.logic;

import java.util.ArrayList;

public class CompassModel {
    private static final CompassModel instance = new CompassModel();
    public static CompassModel getInstance() {
        return instance;
    }
    public final ArrayList<String> compass;
    public CompassModel() {
        compass = new ArrayList<>();
    }

    public void check(int degree) {
        if (Degree.north(degree)) {
            compass.add("North");
        } else if (Degree.northEast(degree)) {
            compass.add("NorthEast");
        } else if (Degree.east(degree)) {
            compass.add("East");
        } else if (Degree.southEast(degree)) {
            compass.add("SouthEast");
        } else if (Degree.south(degree)) {
            compass.add("South");
        } else if (Degree.southWest(degree)) {
            compass.add("SouthWest");
        } else if (Degree.west(degree)) {
            compass.add("West");
        } else if (Degree.northWest(degree)) {
            compass.add("NorthWest");
        } else compass.add("Введено некорректное значение");
    }

    public String getResult (int degree) {
        check(degree);
        return compass.get(compass.size() - 1);
    }
}

package ru.appline.logic;

public class Degree {

    public static boolean north(int degree) {
        return ((degree >= 338 & degree <= 359) | (degree >= 0 & degree <= 22));
    }

    public static boolean northEast(int degree) {
        return (degree >= 23 & degree <= 67);
    }

    public static boolean east(int degree) {
        return (degree >= 68 & degree <= 112);
    }

    public static boolean southEast(int degree) {
        return (degree >= 113 & degree <= 157);
    }

    public static boolean south(int degree) {
        return (degree >= 158 & degree <= 202);
    }

    public static boolean southWest(int degree) {
        return (degree >= 203 & degree <= 247);
    }

    public static boolean west(int degree) {
        return (degree >= 248 & degree <= 292);
    }

    public static boolean northWest(int degree) {
        return (degree >= 293 & degree <= 337);
    }
}

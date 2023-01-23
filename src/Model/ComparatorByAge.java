package Seminars_OOP.HW_5.src.Model;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth());
    }
}
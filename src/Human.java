package Seminars_OOP.HW_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable, Comparable<Human> {
    private String name;
    private int yearOfBirth;
    private String gender;
    private Human father;
    private Human mother;
    private List<Human> childrenList;

    public Human(String name, int yearOfBirth, String gender, Human father, Human mother) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.childrenList = new ArrayList<>();
    }

    public Human(String name, int yearOfBirth, String gender) {
        this(name, yearOfBirth, gender, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public List<Human> getChildren() {
        return childrenList;
    }

    public void setChildren(List<Human> childrenList) {
        this.childrenList = childrenList;
    }

    public void addChild(Human human) {
        if (father != null) {
            father.childrenList.add(this);
        }
        if (mother != null) {
            mother.childrenList.add(this);
        }
    }

    @Override
    public String toString() {
        return name + ": " + yearOfBirth + ", (" + gender + ")";
    }

    @Override
    public int compareTo(Human o) {
        return name.compareTo(o.getName());
    }

}
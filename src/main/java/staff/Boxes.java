package main.java.staff;

import java.util.List;

public class Boxes {

    private String name;
    private List<Thing> things;

    Boxes(String name, List<Thing> things) {
        this.name = name;
        this.things = things;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Thing> getThings() {
        return things;
    }

    public void setThings(List<Thing> things) {
        this.things = things;
    }
}

package main.java.staff;

import java.util.List;

class Boxes {

    private String name;
    private List<Thing> things;

    Boxes(String name, List<Thing> things) {
        this.name = name;
        this.things = things;
    }

    List<Thing> getThings() {
        return things;
    }
}

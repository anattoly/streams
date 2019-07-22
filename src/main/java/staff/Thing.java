package main.java.staff;

public class Thing {

    private String name;
    private boolean fragile;

    Thing(String name, boolean fragile) {
        this.name = name;
        this.fragile = fragile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean getFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    @Override
    public String toString() {
        return name;
    }
}

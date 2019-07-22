package main.java.staff;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BoxStaff {

    private static List<Boxes> arrangeThingsInBox() {
        List<Boxes> boxes = new ArrayList<>();
        boxes.add(new Boxes("box1", List.of(new Thing("Glasses", true))));
        boxes.add(new Boxes("box1", List.of(new Thing("Plates", true))));
        boxes.add(new Boxes("box1", List.of(new Thing("Pen", false))));
        boxes.add(new Boxes("box1", List.of(new Thing("Mirrors", true))));
        boxes.add(new Boxes("box1", List.of(new Thing("Ball", false))));
        boxes.add(new Boxes("box1", List.of(new Thing("Toy", false))));
        boxes.add(new Boxes("box2", List.of(new Thing("Lamp", true))));
        boxes.add(new Boxes("box2", List.of(new Thing("Note", false))));
        boxes.add(new Boxes("box2", List.of(new Thing("Photo frame", false))));
        boxes.add(new Boxes("box2", List.of(new Thing("Cup", true))));
        boxes.add(new Boxes("box2", List.of(new Thing("Lampshades", true))));
        boxes.add(new Boxes("box2", List.of(new Thing("Book", false))));
        return boxes;
    }

    public static List<Protector> packFragileThingsInProtective() {
        return arrangeThingsInBox().stream()
                .flatMap(boxes -> boxes.getThings().stream())
                .filter(Thing::getFragile)
                .map(Protector::new)
                .collect(Collectors.toList());
    }

}

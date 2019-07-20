package main.java.users;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataUsers {

    List<User> users;
    public static List<User> createListUsers() {
        users = new ArrayList<>();

        users.add(new User("a@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "DEV"));
        users.add(new User("b@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "DEV"));
        users.add(new User("c@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "MARKETING"));
        users.add(new User("d@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "C-LEVEL"));
        users.add(new User("e@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "C-LEVEL"));
        users.add(new User("f@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "DEV"));
        users.add(new User("g@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "DEV"));
        users.add(new User("h@gmail.com", LocalDate.parse("19.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "MARKETING"));
        users.add(new User("i@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "MARKETING"));
        users.add(new User("j@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "MARKETING"));

        return users;
    }

}

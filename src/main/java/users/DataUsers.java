package main.java.users;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class DataUsers {

    private static List<User> createListUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User("a@gmail.com", LocalDate.parse("20.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "DEV"));
        users.add(new User("b@gmail.com", LocalDate.parse("20.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "DEV"));
        users.add(new User("c@gmail.com", LocalDate.parse("14.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "MARKETING"));
        users.add(new User("d@gmail.com", LocalDate.parse("15.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "C-LEVEL"));
        users.add(new User("e@gmail.com", LocalDate.parse("16.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "DEV"));
        users.add(new User("f@gmail.com", LocalDate.parse("17.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "C-LEVEL"));
        users.add(new User("g@gmail.com", LocalDate.parse("18.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "DEV"));
        users.add(new User("h@gmail.com", LocalDate.parse("19.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "MARKETING"));
        users.add(new User("i@gmail.com", LocalDate.parse("13.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "MARKETING"));
        users.add(new User("j@gmail.com", LocalDate.parse("19.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "C-LEVEL"));

        return users;
    }

    public static Map<String, List<String>> getTeamUsers() {

        return createListUsers().stream()
                .filter(user -> user.getLoginDate()
                        .isAfter(LocalDate.now().minusDays(8)))
                .collect(groupingBy(User::getDepartment, mapping(User::getEmail, toList())));
    }
}

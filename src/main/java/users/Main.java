package main.java.users;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<User> users = createListUsers();

        Map<String, String> teams = users.stream().filter(user -> user.getLoginDate().isAfter(LocalDate.now().minusDays(8)))
                .collect(Collectors.toMap(User::getTeam, User::getEmail, (a1, a2) -> a1));

        System.out.println(teams);


    }

    private static List<User> createListUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User("a@gmail.com", LocalDate.parse("01.01.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "dev"));
        users.add(new User("b@gmail.com", LocalDate.parse("11.04.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "dev"));
        users.add(new User("c@gmail.com", LocalDate.parse("28.02.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "marketing"));
        users.add(new User("d@gmail.com", LocalDate.parse("30.01.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "c-level"));
        users.add(new User("e@gmail.com", LocalDate.parse("21.03.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "c-level"));
        users.add(new User("f@gmail.com", LocalDate.parse("31.01.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "dev"));
        users.add(new User("g@gmail.com", LocalDate.parse("06.06.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "dev"));
        users.add(new User("h@gmail.com", LocalDate.parse("07.05.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "c-level"));
        users.add(new User("i@gmail.com", LocalDate.parse("12.07.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "marketing"));
        users.add(new User("j@gmail.com", LocalDate.parse("23.02.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "marketing"));

        return users;
    }
}

package main.java;

import main.java.functional_interface.VerifiInteger;
import main.java.users.DataUsers;
import main.java.users.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static main.java.users.DataUsers.t;

public class Main {

    public static void main(String[] args) {

        VerifiInteger even = i -> i % 2 == 0;
        System.out.println(even.verification(99));

        VerifiInteger overHundred = i -> i > 100;
        System.out.println(overHundred.verification(101));


        List<User> users = DataUsers.createListUsers();

        Map<String, String> teams = users.stream()
                .filter(user -> user.getLoginDate().isAfter(LocalDate.now().minusDays(8)))
                .collect(Collectors.toMap(User::getTeam, User::getEmail, (a1, a2) ->  a1 + ", " + a2));

        //teams.forEach((k, v) -> System.out.println(k + "\n " + v));
        System.out.println(teams);



    }
}

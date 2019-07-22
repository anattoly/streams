package main.java;

import main.java.cinema.MoviePoster;
import main.java.functional_interface.VerifiInteger;
import main.java.staff.BoxStaff;
import main.java.users.DataUsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("============= Enter number for verification ============");
        boolean isInt = false;
        while (!isInt)
            try {
                Integer evenInt = Integer.parseInt(reader.readLine());
                isInt = true;
                VerifiInteger even = i -> i % 2 == 0;
                System.out.println(even.verification(evenInt)
                        ? "You number is even..."
                        : "You number is not even...");
                VerifiInteger overHundred = i -> i < 100;
                System.out.println(overHundred.verification(evenInt)
                        ? "...but less than a hundred"
                        : "...and over Hundred!!!");
            } catch (NumberFormatException | IOException e) {
                System.out.println("You entered not integer. Please, try again");
                isInt = false;
            }

        System.out.println("============= Users who logged in last week =============");
        DataUsers.getTeamUsers().forEach((k, v) ->
                System.out.println("Next Users from " + k + " department logged in for the last week: " + v));

        System.out.println("============= Average price of Genre ============");
        MoviePoster.getAveragePrice().forEach((k, v) ->
                System.out.println(k + " - " + v));

        System.out.println("============= Quantity movie for Genre =============");
        MoviePoster.getQuantityMovieOfGenre().forEach((k, v) ->
                System.out.println(k + " - " + v));

        System.out.println("============= Protection Things =============");
        BoxStaff.packFragileThingsInProtective().forEach(System.out::println);

    }
}

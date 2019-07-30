package main.java;

import main.java.cinema.MoviePoster;
import main.java.funcinterface.VerifyInteger;
import main.java.staff.BoxStaff;
import main.java.users.DataUsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    private static final String LINE_SEPARATOR = "=============";

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(LINE_SEPARATOR + " Enter number for verification " + LINE_SEPARATOR);
        boolean isInt = false;
        while (!isInt)
            try {
                Integer evenInt = Integer.parseInt(reader.readLine());
                isInt = true;
                VerifyInteger even = i -> i % 2 == 0;
                System.out.println(even.verification(evenInt)
                        ? "You number is even..."
                        : "You number is not even...");
                VerifyInteger overHundred = i -> i < 100;
                System.out.println(overHundred.verification(evenInt)
                        ? "...but less than a hundred"
                        : "...and over Hundred!!!");
            } catch (NumberFormatException | IOException e) {
                System.out.println("You entered not integer. Please, try again");
                isInt = false;
            }

        System.out.println(LINE_SEPARATOR + " Users who logged in last week " + LINE_SEPARATOR);
        DataUsers.getTeamUsers().forEach((k, v) ->
                System.out.println("Next Users from " + k + " department logged in for the last week: " + v));

        System.out.println(LINE_SEPARATOR + " Average price of Genre " + LINE_SEPARATOR);
        MoviePoster.getAveragePrice().forEach((k, v) ->
                System.out.println(k + " - " + v));

        System.out.println(LINE_SEPARATOR + " Quantity movie for Genre " + LINE_SEPARATOR);
        MoviePoster.getQuantityMovieOfGenre().forEach((k, v) ->
                System.out.println(k + " - " + v));

        System.out.println(LINE_SEPARATOR + " Protection Things " + LINE_SEPARATOR);
        BoxStaff.packFragileThingsInProtective().forEach(System.out::println);

    }
}

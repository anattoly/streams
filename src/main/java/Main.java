package main.java;

public class Main {

    public static void main(String[] args) {

        VerifiInteger even = integer -> integer > 10;
        System.out.println(even.verification(99));
    }
}

package main.java.functional_interface;

public class Main {

    public static void main(String[] args) {

        VerifiInteger even = i -> i > 10;
        System.out.println(even.verification(99));
    }
}

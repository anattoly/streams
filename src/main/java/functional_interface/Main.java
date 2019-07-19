package main.java.functional_interface;

public class Main {

    public static void main(String[] args) {

        VerifiInteger even = i -> i % 2 == 0;
        System.out.println(even.verification(99));

        VerifiInteger overHundred = i -> i > 100;
        System.out.println(overHundred.verification(101));


    }
}

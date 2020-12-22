package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(namemathood(20, -20));
        System.out.println(namemathood(0, 0));
        System.out.println(namemathood(45, -10));
        System.out.println(namemathood(87,76));
    }

    public static String namemathood(int a, int t) {
        if (a >= 20 && a <= 45 && t >= -20 && t <= 30) {
            return "можно идти гулять";
        } else if (a >= 0 && a <= 20 && t >= 0 && t<= 28) {
            return "можно идти гулять";
        } else if (a >= 45 && t >= -10 && t <= 25) {
            return "можно идти гулять";
        } else {
            return  " оставайтесь дома";


        }

    }
}


package org.example;

public class Main {
    public static int add(String numbers) {
        String[] numArray = numbers.split("[,\n]");

        int sum = 0;
        for (String num : numArray) {
            int number = Integer.parseInt(num.trim());

            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add("1"));
        System.out.println(add("1,5"));
    }
}
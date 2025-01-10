package org.example;

public class Main {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, numbers.indexOf("\n"));
            numbers = numbers.substring(numbers.indexOf("\n") + 1);
            numbers = numbers.replace(delimiter, ",");
        }
        String[] numArray = numbers.split("[,\n]");

        int sum = 0;
        for (String num : numArray) {
            int number = Integer.parseInt(num.trim());
            if (number < 0) {
                throw new IllegalArgumentException("negative numbers not allowed " + number);
            }
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add("1"));
        System.out.println(add("1,5"));
    }
}
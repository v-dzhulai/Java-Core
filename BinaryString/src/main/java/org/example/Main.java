package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(toBinaryString(2));
    }

    public static String toBinaryString(int value) {
        StringBuilder str = new StringBuilder();
        int num = value;

        for (int i = 0; i < value; i++) {
            str.append(num % 2);
            num /= 2;
        }

        return value == 0 ? "0" : str.toString();
    }
}
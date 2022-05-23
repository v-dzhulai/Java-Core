package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(matchResult(0, 2, 1, 1));
        System.out.println(matchResult(1, 1, 1, 1));
        System.out.println(matchResult(1, 4, 2, 3));
    }

    public static int matchResult(int result1, int result2, int bet1, int bet2) {
        return result1 == bet1 && result2 == bet2 ? 2 :
               (result1 < result2 && bet1 < bet2) ||
               (result1 > result2 && bet1 > bet2) ||
               (result1 == result2 && bet1 == bet2) ? 1 : 0;
    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        String arr[] = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};

        System.out.println(createDailyPlan(new String[] {}));
    }

    public static String createDailyPlan(String[] plans) {
        if (plans.length == 0) {
            return "My plans:";
        }

        StringBuilder str = new StringBuilder().append("My plans:\n");

        for (int i = 0; i < plans.length; i++) {
            str.append(i + 1 + ".) " + plans[i]);
            str.append(i == plans.length - 1 ? ";" : ";\n");
        }

        return str.toString();
    }
}
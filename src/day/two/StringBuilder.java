package day.two;

public class StringBuilder {
    static int number = 100;
    static String name = "EMP";

    public static void main(String[] args) {
        printLines();
        stringBuilderAppend();
    }

    private static void stringBuilderAppend() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(name);
        sb.append("AATIA");
        System.out.println(sb);
    }

    private static void printLines() {
        System.out.println(name);
        System.out.println(number);
    }

    public double notInUse() {
        double a = 2;
        double b = 3;
        return a * b;
    }
}
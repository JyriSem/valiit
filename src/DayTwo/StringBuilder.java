package DayTwo;

public class StringBuilder {
    int number;
    static String name = "EMP";

    public static void main(String[] args) {
        System.out.println(name);
//        System.out.println(number);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(name);
        sb.append("AATIA");
        System.out.println(sb);

    }

    public double multiply() {
        double a = 2;
        double b = 3;
        return a * b;
    }
}
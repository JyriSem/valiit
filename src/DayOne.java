public class DayOne {
    public static void main(String[] args) {
        int a = -5;
        int b = -5;

        if ((a < b) && (a > 0)) {
            System.out.println("B is bigger than A, and A is positive");
        } else if ((a > b) && (b > 0)) {
            System.out.println("A is bigger than B, and B is positive");
        } else if ((a == b) || (a < 0) && (b < 0)) {
            System.out.println("A and B are either equal or both are negative");
        } else {
            System.out.println("No specific conditions were met");
        }
    }
}
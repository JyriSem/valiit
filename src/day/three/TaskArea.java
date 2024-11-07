package day.three;

public class TaskArea {
    public static void main(String[] args) {
        getArea(4, 5);
    }

    private static void getArea(int sideA, int sideB) {
        int area = sideA * sideB;
        checkArea(area);
    }

    private static void checkArea(int area) {
        int compareAreaValue = 20;
        if (area > compareAreaValue) {
            System.out.println("The area is greater than " + compareAreaValue);
        } else if (area < compareAreaValue) {
            System.out.println("The area is less than " + compareAreaValue);
        } else {
            System.out.println("The area is equal to " + area);
        }
    }
}
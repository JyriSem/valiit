package DayFour;

public class LoopArray {
    public static void main(String[] args) {
        arrayForElements();
    }

    public static void arrayForElements() {
        String[] elements = {"a", "b", "c", "d", "e", "f"};
        for (String element : elements) {
            System.out.println("Elements " + element);
        }
    }
}
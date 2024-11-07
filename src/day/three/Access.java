package day.three;

public class Access {
    public static void main(String[] args) {
        boolean key1 = true;
        boolean key2 = true;
        boolean key3 = false;
        accessLevelOne(key1, key2, key3);
    }

    private static void accessLevelOne(boolean key1, boolean key2, boolean key3) {
        if (key1) {
            accessLevelTwo(key2, key3);
            System.out.println("Level One Granted");
        } else {
            System.out.println("Access Denied");
        }
    }

    private static void accessLevelTwo(boolean key2, boolean key3) {
        if (key2) {
            accessLevelThree(key3);
            System.out.println("Level Two Granted");
        } else {
            System.out.println("Access Denied");
        }
    }

    private static void accessLevelThree(boolean key3) {
        if (key3) {
            System.out.println("Level Three Granted");
        }
        System.out.println("Access Denied");
    }
}
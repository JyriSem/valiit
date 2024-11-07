package DayThree;

public class Back {
    public static void main(String[] args) {
        int id = 1;
        getUser(id);
    }

    public static void getUser(int id) {
        getName();
        getAge(id);
    }

    private static String getName() {
        String name = "Grand Finale";
        return name;
    }

    private static int getAge(int userID) {
        int age = 30;
        return age;
    }
}
package day.five;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bob");
        list.add("pop");
        list.add("tot");

        list.remove(0);

        list.set(1, "lol");

        list.remove("pop");

        for (String s : list) {
            System.out.println(s);
        }
//        System.out.println(list.get(1));
    }
}

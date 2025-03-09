package javaAndSeleniumPrograms;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5, 15);

        // Iterating and modifying the list
        for (Integer num : list) {
            if (num == 2) {
                list.remove(num);  // 🚨 Throws ConcurrentModificationException
            }
        }
    }
}
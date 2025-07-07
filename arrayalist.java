import java.util.*;

class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicates allowed

        System.out.println(list); // [Apple, Banana, Apple]
    }
}
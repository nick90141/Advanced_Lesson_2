package task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите слово " + i + ": ");
            String word = reader.readLine();
            list.add(word);
        }
        doubleValues (list);
        for (String word : list) {
            System.out.println(word);
            System.out.println(word);
        }
    }
    public static void doubleValues(ArrayList<String> list) {
        ArrayList<String> doubledList = new ArrayList<>();
        for (String word : list) {
           doubledList.add(word);
           doubledList.add(word);
        }
        System.out.println("\nУдвоенный список: " + doubledList);
    }
}

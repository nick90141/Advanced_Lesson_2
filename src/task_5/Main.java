package task_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите слова (для завершения введите 'end'):");

        while (true) {
            String word = in.nextLine();
            if (word.equals("end")) {
                System.out.println("Конец ввода слов");
                break;
            } else {
                list.add(word);
            }
        }

        System.out.println("\nСписок введенных слов:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Слово " + (i + 1) + ": " + list.get(i));
        }
    }
}


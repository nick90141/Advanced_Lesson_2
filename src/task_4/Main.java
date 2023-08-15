package task_4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> people = new HashMap<>();
        people.put ("Москва", "Іванови");
        people.put ("Київ", "Петрови");
        people.put ("Лондон", "Абрамовичі");


        System.out.print("Введіть назву міста - Москва, Київ, Лондон");
        Scanner in = new Scanner(System.in);
        System.out.println("\nПриклад введення:");
        String input = in.nextLine();

        String value = people.get(input);
        if (value != null){
            System.out.println("Приклад виведення:" + "\n" + value);
        } else {
            System.out.println("Ви ввели некоректне значення!");
        }
    }
}

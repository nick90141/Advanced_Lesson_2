package task_3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        getIntegerList(linkedList);

        int minValue = getMinimum(linkedList);
        System.out.println("Минимальное значение элемента из списка - " + minValue);

    }
    public static void getIntegerList (LinkedList<Integer> linkedList) {
        System.out.print("Введите целое значения для числа N: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        System.out.println("Введите " + N + " целых чисел:");
        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            linkedList.add(num);
        }
    }
    public static int getMinimum (LinkedList<Integer> linkedList) {
        int minValue = linkedList.get(0);
        for (int i = 1; i < linkedList.size(); i++) {
            int current = linkedList.get(i);
            if (current < minValue){
                minValue = current;
            }
        }
        return minValue;
    }
}


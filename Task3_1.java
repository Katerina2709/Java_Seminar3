package io.github.jiangdequan;
import java.util.ArrayList;
import java.util.Random;

public class Task3_1 {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = random.nextInt(10) + 10;
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(19) - 9);
        }
        System.out.println("Рандомный список целых чисел:\n" + list);
        int j = 0;
        while (j < list.size()) {
            if (list.get(j) % 2 == 0) list.remove(j);
            else j++;
        }
        System.out.println("После удаления четных чисел:\n" + list);
    }
}
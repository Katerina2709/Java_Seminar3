package io.github.jiangdequan;
import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = random.nextInt(10) + 10;
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(19) - 9);
        }
        System.out.println("Рандомный список целых чисел:\n" + list);
        int numMax = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > numMax) {
                numMax = list.get(i);
            }
        }
        System.out.println("Максимальное значение: " + numMax);
    }
}
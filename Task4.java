package io.github.jiangdequan;
import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = random.nextInt(10) + 10;
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(19) - 9);
        }
        System.out.println("Рандомный список целых чисел:\n" + list);
        double sum = 0;
        double numMidl;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        numMidl = sum / list.size();
        System.out.printf("Среднее значение: %.2f", numMidl);
    }
}

package HW4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        //Заполнить массив на 45 элементов случайными числами от -50 до +50.
        // Найти минимальный элемент и вывести его на консоль. Найти максимальный элемент и вывести его на консоль.

        Random randomNub = new Random();
        int[] randomInt = new int[45];

        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = new Random().nextInt(-50, 50);
            System.out.println(randomInt[i]);

        }
        int min = 0;
        for (int i = 0; i < randomInt.length; i++) {
            for (int a = 0; a < randomInt.length; a++) {
                if (randomInt[i] > randomInt[a]) {
                    min = randomInt[a];
                    randomInt[a] = randomInt[i];
                    randomInt[i] = min;

                }
            }
        }

        System.out.println("найменше число" + min);

        int max = 0;
        for (int i = 0; i < randomInt.length; i++) {
            for (int b = 0; b < randomInt.length; b++) {
                if (randomInt[i] < randomInt[b]) {
                    max = randomInt[b];
                    randomInt[b] = randomInt[i];
                    randomInt[i] = max;

                }
            }
        }
        System.out.println("найбільше число" + max);
    }}

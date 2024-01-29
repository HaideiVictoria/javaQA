package HW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       //Есть одномерный массив из 10 элементов, заполнен- ный случайными числами. Пользователь вводит с клавиатуры число.
        // Программа показывает есть ли такое число в созданном до этого массиве.

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Масив: " + Arrays.toString(array));
            Scanner scanner=new Scanner(System.in);
            System.out.println("ВВедіть число");
            int user= scanner.nextInt();
            boolean found= false;
            for (int number :array ){
                if(number==user){
                    found=true;
                    break;
                }}
            if (found){
                System.out.println("число"+user+"знайдено");
            }else {
                System.out.println("число"+user+"не знайдено");
            }
    }}}


package HW5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {// За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
    // та пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name. •
    // Перед початком на екран виводиться текст: Let the game begin! •
    // Сам процес гри обробляється у нескінченному циклі. •
    // Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим, що ввів користувач. •
    // Якщо введене число менше загаданого, програма виводить на екран текст: Your number is too small. Please, try again..
    // Якщо введене число більше за загадане, то програма виводить на екран текст: Your number is too big. Please, try again.. •
    // Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}! •
    // Завдання повинно бути виконане за допомогою масиви (

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();



        System.out.println("Let the game begin");
        System.out.println("Напишіть своє імя:");
        int number= random.nextInt(101);

        String name= scanner.nextLine();


        int [] attempts=new int[101];int attemptCount = 0;
            while (true){
                System.out.println("Введіть число");
                int randonNumber= scanner.nextInt();

            if ( number>randonNumber){
                    System.out.println("Your number is too small. Please, try again");
            }
            else if (number<randonNumber){
                System.out.println("Your number is too big. Please, try again");
            }
            else {
                System.out.println("Congratulations"+name+"!");
                break;

        }}System.out.print("Ваші спроби: ");
        for (int i = 0; i < attemptCount; i++) {
            System.out.print(attempts[i] + " ");

    }
}}









package HW4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {//Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”. Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20. Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”. Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов. Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00” Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”


    String[]name= {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Гліб"};
    int []time={10,12,14,16,18,20};
    String[]place={"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть індекс імя(от 0 до 6): ");
        int nameIndex = scanner.nextInt();

        System.out.print("Введіть індекс часу (от 0 до 5): ");
        int timeIndex = scanner.nextInt();

        System.out.print("Введіть індекс місця(от 0 до 5): ");
        int placeIndex = scanner.nextInt();
        if (nameIndex >= 0 && nameIndex < name.length &&
                timeIndex >= 0 && timeIndex < time.length &&
                placeIndex >= 0 && placeIndex < place.length) {
            String message = String.format("%s будет идти в %s в %d:00",
                name[nameIndex], place[placeIndex], time[timeIndex]);
            System.out.println(message);
        } else {
            System.out.println("Введіть точні дані");
        }
}}

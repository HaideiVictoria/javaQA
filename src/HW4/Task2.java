package HW4;

import java.util.Scanner;

public class Task2 {//Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет,
    // является она полиндромом или нет. И выводит данную информацию на экран.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("insert number");
        String number= scanner.nextLine();
        String revertNumber="";
        for (int i=number.length() -1; i>=0; i--){
            revertNumber=revertNumber+number.charAt(i);
        }
        System.out.print(number);
        System.out.print(revertNumber);
        if (number.equals(revertNumber)){
            System.out.print("polidrom");}
        else {
            System.out.print("Not polidrom");}
    }
}

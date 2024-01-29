package HW4;

import java.util.Scanner;

public class Task1 {//Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова,
    // и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.
    // Все слова введенные до этого должны отобразится в консоли одним предложением.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("ввести свої слова:");
            String words= scanner.nextLine();
            if (words.equalsIgnoreCase("STOP")){
                break;
            }
            System.out.print(" "+words);

        }
        System.out.println("STOP для закінчення речення");

    }
}

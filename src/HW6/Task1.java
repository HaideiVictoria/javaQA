package HW6;

import java.util.Arrays;

public class Task1 {//Массив заполняется случайными числами от 0 до 1000.
    // Необходимо создать одномерный массив, состоящий из максимальных значенийаждого отдельного массива входящего в двумерный.
    // Новый полученный массив вывести на экран.


    public static void main(String[] args) {
        int[][] array=new int[2][5];
        int[][]numberArray={{659,14,78,55,10},{999,1,697,783,801}};
        int[]number=new int[2];
        for (int i=0; i < numberArray.length; i++){
            int max=numberArray[i][0];
            for (int a=0; a<numberArray[i].length;a++){
                if (numberArray [i][a]>max){
                    max=numberArray[i][a];
                }
            }
number[i]=max;
        }
        System.out.println("Ваші максимальні значення з масивів");
        System.out.println(Arrays.toString(number));
    }
}

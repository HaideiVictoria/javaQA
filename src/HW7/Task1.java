package HW7;

public class Task1 {//Написать метод, принимающий в качестве параметра массив целых чисел.
    // И выводит на экран все четные числа списком, a также нечетные числа списp
    public static void main(String[] args) {
        int[]numders={1,15,76,89,14,23,36,99,100,888};
        numderOddEven(numders);
    }

    private static void numderOddEven(int[] numders) {
        System.out.println("Odd numbers: ");
        for (int i=0; i< numders.length;i++){
            if (numders[i]%2!=0){
                System.out.print(numders[i]+" ");
    }

                }
        System.out.println("Even numbers: ");
        for (int a=0; a< numders.length;a++)
            if (numders[a] % 2 == 0) {
                System.out.print(numders[a] + " ");
}


}}

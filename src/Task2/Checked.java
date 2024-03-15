package Task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Checked {
    static class IndexOutOfRangeException extends Exception {
    public IndexOutOfRangeException(String message) {
        super(message);
    }
}



    class ArrayGenerationException extends Exception {
        public ArrayGenerationException(String message) {
            super(message);
        }
    }

    static class ZeroDivisionException extends Exception {
        public ZeroDivisionException(String message) {
            super(message);
        }
    }

public static double processArray() throws Checked.IndexOutOfRangeException, Checked.ArrayGenerationException, Checked.ZeroDivisionException {

   Random random = new Random();
    int size = random.nextInt(31) ;

    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
        array[i] = random.nextInt(31);
    }


    Scanner scanner = new Scanner(System.in);
    System.out.println("Масив (від 0 до " + (size - 1) + "):");
    int index;
    try {
        index = scanner.nextInt();
    } catch (InputMismatchException e) {
        throw new Checked.IndexOutOfRangeException("Індекс маю бути цілим числом.");
    }

    if (index < 0 || index >= size) {
        throw new Checked.IndexOutOfRangeException("Індекс не в діапазоні чисел.");
    }


    if (array[0] == 0) {
        throw new Checked.ZeroDivisionException("Перший елемент не = 0");
    }

    return (double) array[index] / array[0];
}}

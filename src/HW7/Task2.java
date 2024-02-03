package HW7;

public class Task2 {//  Написать перегруженный метод, который может:
    // Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой"
    // •	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение
    // •	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
    // \•	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.\
    // •	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа: "Ваше сообщение - "%%%%%%%%", ваше число -  $",
    // где "%%%%%%%%" и $ ваши введенные строка и число соответственно.


        public static void main(String[] args) {



            printMessage();

            String[] stringArray = {"QA", "testing", "is hard"};
            printMessage(stringArray);

            int[] intArray = {1, 2, 3, 4, 5};
            printMessage(intArray);


        }

        public static void p() {
            System.out.println("Я пустий");
        }

        public static void printMessage() {
            System.out.println("message");
        }

        public static void printMessage(String[] stringArray) {
            for (String str : stringArray) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        public static void printMessage(int[] intnumbers) {
            int sum = 0;
            for (int num : intnumbers) {
                sum=num+sum;
            }
            System.out.println("Сума елементів масиву: " + sum);
        }

        public static void printMessage (String message, int number) {
            System.out.println("Ваше повідомлення" + message + "ваше число" + number);
        }
    }



package HW6;

import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
//• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
//• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
//• Сам процес гри обробляється у нескінченному циклі.
//• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
//• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
//• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
//• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
//• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
//• Уражену ціль відзначити як x.
//• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
//Приклад виведення в консоль:
//
//[0, 1, 2, 3, 4, 5]
//[1, -, *, -, -, -]
//[2, -, -, -, -, -]
//[3, -, *, -, -, -]
//[4, -, -, *, -, -]
//[5, -, *, -, -, *]
//Assignments

        System.out.println("All Set. Get ready to rumble!");
char [][] array=new char[5][5];
int row=3;
int column=4;
for (int i=0;i<5;i++){
    for (int a=0;a<5;a++){
        array[i][a]='-';
    }

}

        Scanner scanner=new Scanner(System.in);

int vertical=-1;
int horizontal=-1;

        
        
while (!checkNumb(row,column,vertical,horizontal)){
    vertical=-1;
    horizontal=-1;


}
while (horizontal<0 || horizontal>4){
    System.out.println("Введіть число для рядка : ");
   if ( scanner.hasNextInt()){
       horizontal= scanner.nextInt();
   }else {
       System.out.print("Такого числа немає.Введіть ще раз");
       scanner.nextLine();
   }
    array[vertical][horizontal]='x';
   for (int i=0; i<5;i++){
       for (int a=0;a<5;a++){
           System.out.print(array[i][a]);}
    }
}

        System.out.print("You have won!");


}
private static boolean checkNumb(int row, int column, int vertical, int horizontal) {
        return false;
    }}

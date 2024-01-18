import java.util.Locale;

public class work2 { public static void main(String[] args) {

      /* Создать переменную string1 = "This line that i want to cut, cause it is too long".
Создать строку string2 в которой должно быть помещено значение строки string1,
Обрезанное до "This line that i want to cut, cause".
Создать строку string3 на основе string2 которое будет содержать значение
"This line that don't want to cut, cause it is perfect".
Вывести на консоль каждое сообщение и его длину.



        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 37);
        string2 = string2.substring(0,string1.length()-14);
        String string3=string2.substring(0,string2.length()-22).concat("don't want to cut, cause it is perfect");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);



        2
        Создать строку string = "Testing, is my favourite job".
Вывести на экран отдельно каждое слово и длину этого слова в след виде:
Cлов1 = (значение слова), Длина этого слова = (значение длины слов).
Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
и т.д.
Вывести на консоль true, если первое слово длиннее остальных, в
противном случае вывести false.


        String string1="Testing, is my favourite job";
        String word1= String.valueOf("Testing".length());
        String word2= String.valueOf("is".length());
       String word3= String.valueOf("my".length());
       String word4= String.valueOf("favourite".length());
       String word5= String.valueOf("job".length());
       System.out.println(word1);
       System.out.println(word2);
       System.out.println(word3);
       System.out.println(word4);
       System.out.println(word5);


       String word1="Testing";
       String word2="is";
       String word3="my";
       String word4="favourite";
       String word5="gob";

      /* System.out.println(Objects.equals(word1,word2));
       System.out.println(Objects.equals(word1,word3));
       System.out.println(Objects.equals(word1,word4));
       System.out.println(Objects.equals(word1,word5));*/

/*
       3
       При применении к массиву строк поля length, можно узнать сколько
элементов находится в массиве.
Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
то при вызове поля lenth:
int size = arrayOfString.length;
можно получить какое количество символов находится в данном массиве.

Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
символ 'a' встречается в  строке:
        "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method."

Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.
       */
    String arraysOfString="Completely random text in English. In it, we just need to determine how many times the character 'a'" +
            " occurs there. And we can use the split method and the length method.";
    arraysOfString=arraysOfString.toLowerCase(Locale.ROOT);
    String [] strings=arraysOfString.split("a");
    int letter=strings.length-1;
    System.out.println("кількість букв а"+letter);




}}
}

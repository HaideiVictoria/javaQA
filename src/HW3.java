import java.util.Scanner;

public class HW3 {
    public static boolean main(String[] args) {
                /*У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.

Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить перемнным типа String следующие значения:
string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно?
Помимо string1, string2, string3, string4 новых переменных создавать нельзя.


        Scanner scanner = new Scanner(System.in);


        System.out.println(" Я тестирую замечательно. Что еще нужно?");
        String text = scanner.next();


        String string1 = text;
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next();

        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);



        2.
        Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли из этих сторон построить треугольник.
         (необходимо вспомнить правило построения треугольника по трем сторонам).


        int side1;
        int side2;
        int side3;
        Scanner scanner=new Scanner();
        System.out.println("Ввести дані для побудування трикутника);


            side1 = Integer.valueOf(scanner.next());
            side2 = Integer.valueOf(scanner.next());
            side3 = Integer.valueOf(scanner.next());


        if(side1>0 && side2>0 && side3>0 && (side1+side2)>side3 && (side2+side3)>side1 && (side1+side3)>side2){
             System.out.printf("можна побудувати трикутник");}
         else {
             System.out.printf("не можна побудувати трикутник");}


             3.
             При помощи тернарного оператора необходимо получить разность
             двух чисел введенных с клавиатуры, и всегда отнимать от большего меньшее. Вывести эту разность в консоль.

        Scanner scanner= new Scanner(System.in);
        int number1;
        int number2;
        number1= scanner.nextInt();
        System.out.println("ввести перше число");
        number2= scanner.nextInt();
        System.out.println("ввести друге число");
        int difference=(number1 > number2) ? (number1 - number2):(number2-number1);
        System.out.println("різниця чисел"+difference);

        4.
        (Использовать операторы if-else-if) Пользоватьель вводит с клавиатуры числа: Если число равно 1, то выводин на консоль “Понедельник”;
        Если число равно 2, то выводин на консоль “Вторник”; Если число равно 3, то выводин на консоль “Среда”;
         Если число равно 4, то выводин на консоль “Четверг”; Если число равно 5, то выводин на консоль “Пятница”;
          Если число равно 6, то выводин на консоль “Суббота”;
         Если число равно 7, то выводин на консоль “Воскресенье”; В противном случае выводим текст: “Лучше бы сегодня была пятница”.

        Scanner scanner = new Scanner(System.in);
        int day = Integer.valueOf(scanner.next());
        if (day == 1) {
            System.out.println("monday");
        }
        if (day == 2) {
            System.out.println("tuesday");
        }
        if (day == 3) {
            System.out.println("wednesday");
        }
        if (day == 4) {
            System.out.println("thursday");
        }
        if (day == 5) {
            System.out.println("friday");
        }
        if (day == 6) {
            System.out.println("saturday");
        }
        if (day == 7) {
            System.out.println("sunday");
        } else {
            System.out.println("Лучше бы сегодня была пятница");

            5
            Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа и символ – или + или % или / или *. На экран выводится резултат действия над двумя введенными числами.
             Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.


        Scanner scanner=new Scanner(System.in);
        int num1, num2;
        num1=Integer.parseInt(scanner.next());
        num2=Integer.parseInt(scanner.next());
        System.out.println("ввести число");
        System.out.println("ввести  символ – или + или % или / или *");
        String string= scanner.next();
        int result= string.equals("-") ? num1-num2 :string.equals("+") ? num1-num2 :string.equals("%") ? num1-num2:string.equals("*") ? num1-num2:string.equals("/") ? num1-num2:0;
        System.out.println("Результат"+result);

        6.
        Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
        Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
        Программа должна спросить пользователя какая про
грамма ему интересна, также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
        Если программа с таким названием не существует выводит сообщение в консоль, о том что такой программы не существует.
        Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том что такой ОС не существует.
                 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("выбора программ взять: ntelliJI IDEA, Git, Java");
        System.out.println("ОС взять: Linux, macOS, Windows");
        String program=scanner.next();
        String os=scanner.next();
        switch (program+os){
            case ("IntelliJ+Windows") :
                System.out.println("IntelliJ+Windows"+"https://www.jetbrains.com/ru-ru/idea/download/?section=windows");
                break;
            case ("Git+Windows"):
                    System.out.println("Git+Windows"+"https://github.com/git-guides/install-git");break;
            case ("Java+Windows"):
                System.out.println("Java+Windows"+"https://www.java.com/ru/download/ie_manual.jsp?locale=ru");break;
            default:
                System.out.println("такой ОС не существует");
        }






    }



























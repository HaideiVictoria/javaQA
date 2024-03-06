package HW8;

import java.util.Scanner;

/*Создать класс калькулятор.
В нем создать методы:
summ, minus, multiply, division.
Сложение, вычитание, умножение и деление соответственно.
Каждый метод принимает в качестве параметров два значения типа double.
И выводит в консоль результат действия.

Также в классе есть метод старт. Который выводит сообщение в консоль, что
калькулятор запущен. И предлагает ввести действие в вашей консоли.

Калькулятор должен принимать только следующие типы действий:
2+4;    - пример синтаксиса сложения;
5-6;    - пример синтаксиса вычитания;
25*3;   - пример синтаксиса умножения;
34/3;   - пример синтаксиса деления;

После ввода действия на консоль выводится ответ этого действия.
И после снова выводится сообщение о предложении ввести действие.

В случае ввода другого синтаксисана консоль возвращается сообщение:
"Введите корректное действие".
И после снова выводится сообщение о предложении ввести действие.*/



    public class Calculator {

        public Calculator() {
        }


            public void summ ( double a, double b){
                System.out.println("Результат :" + (a + b));
            }
            public void minus ( double a, double b){
                System.out.println("Результат :" + (a - b));
            }
            public void multiply ( double a, double b){
                System.out.println("Результат :" + (a * b));
            }
            public void division ( double a, double b){
                System.out.println("Результат :" + (a / b));
            }
            public void start () {
                System.out.println("калькулятор запущений");
                while (true) {
                    System.out.println("ВВедіть в такому форматі математичні вирази:'a+b','a-b','a*b','a/b'");
                    Scanner scanner = new Scanner(System.in);
                    String numbers = scanner.nextLine();
                    if (numbers.equalsIgnoreCase("Stop")) {
                        System.out.println("Розрахунок завершено");
                    }
                    break;


                }}}




package HW8;

public class Tree {/*Создать класс Tree с перегруженными конструкторами.
Необходимо создать одномерный массив, состоящий из максимальных значений
В классе есть Tree есть поля:
String type; int height, int coutOfsticks, String colour;

Конструктор1 принимающий в параметры String type; int height
и присваивающий значение полям coutOfsticks значение 13,
colour "Зеленый".

Конструктор2 принимающий в параметры int height, int coutOfsticks,
String colour и присваивающий значение полю type "пихта".

Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
сolour = "Желтый".

Конструктор4 который принимает в параметры String type,
и вызывает внутри себя конструктор 3.

Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.


*/
    public String type;
   public int height;
  public   int coutOfsticks;
    public String colour;

    public Tree (String type,int height){
        this.type=type;
        this.height=height;
        this.coutOfsticks=13;
        this.colour="green";

    }
    public Tree(int height,String colour,int coutOfsticks){
        this.type="fir";
        this.height=height;
        this.coutOfsticks=coutOfsticks;
        this.colour=colour;


    }
    public Tree(){
        this.type=type;
        this.height=350;
        this.coutOfsticks=29;
        this.colour="yellow";
    }
    public Tree (String type){
        this();
        this.type=type;

    }
}

package HW9;

public class Main {
    public static void main(String[] args) {
        Human mother =new Human("Jane","Karleone",1986);
        Human father =new Human("Vito","Karleone",1977);
        Human child =new Human("Mickael","Karleone",5," mother","father");
        Pet pet =new Pet("dog","Rock",5,75, new String[]{"eat,sleap,drink"});


        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);
        System.out.println(pet);



        Family family = new Family(mother, father);
        family.addChild(child);
        family.setPet(pet);
        mother.setFamily(family);
        father.setFamily(family);
        child.setFamily(family);

    }




}

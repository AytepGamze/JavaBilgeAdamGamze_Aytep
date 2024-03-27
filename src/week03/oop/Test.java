package week03.oop;

public class Test {
    public static void main(String[] args) {
        ClassName className1 = new ClassName();
        System.out.println(className1.sayHello ( "gamze"));
        System.out.println(className1.sum(1,5));

        ClassName className2= new ClassName();
        System.out.println(className2.sayHello ( "ruveyda"));
        System.out.println(className2.sum(8,12));

        Person p1= new Person();
        p1.name= " Gamze ";
        p1.gender= " Female";
        p1.nickname= "farketmez";
        p1.sleep();
        p1.walk();

        Person p2= new Person();
        p2.name= " Ruveyda ";
        p2. nickname= "ruvii";
        p2.walk();
        p2.sleep();
        System.out.println(p2.nickname);

    }
}

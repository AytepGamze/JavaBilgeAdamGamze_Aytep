package week03.oop.principles.inheritance;

public class Dog extends Animal{
    public void display(){

        System.out.println("My name is"+name);
    }
    @Override
    public void eat() { //method overriding
        //super.eat(); //superclassdaki eat metodu
       // this.eat(); // bu sınıftaki eat metodu
        System.out.println("Dog can eat.");
    }
}

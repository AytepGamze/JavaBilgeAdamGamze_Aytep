package week04.polymorphism.runtime.ornek02;

public class Dog extends Animal{
    int size= 4;
    String name= "Dog";

    @Override
    void feetSize() {
        System.out.println("Dog' feetSize");
    }
    void gender() {
        System.out.println("Male");
    }
}

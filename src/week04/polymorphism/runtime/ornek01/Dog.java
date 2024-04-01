package week04.polymorphism.runtime.ornek01;

public class Dog extends Animal{
    public Dog() {
        super();
    }
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

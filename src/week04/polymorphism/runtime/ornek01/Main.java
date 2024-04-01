package week04.polymorphism.runtime.ornek01;

public class Main {
    public static void main(String[] args) {

        /* Animal sınıfından oluşturulan bir nesne,
        animal tipinde bir referansla tutuluyor. */
        Animal animal= new Animal();

        /* Dog sınıfında oluşturulan oluşturulan bir nesne,
        animal tipinde bir referansla tutuluyor. */
        Animal animal2= new Dog();
        animal2.makeSound();

    }
}

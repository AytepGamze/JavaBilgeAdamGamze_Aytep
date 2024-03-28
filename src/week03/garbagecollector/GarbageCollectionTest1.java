package week03.garbagecollector;

public class GarbageCollectionTest1 {
    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.name= "esek";

        Animal animal2= new Animal("essssek");
        System.out.println(animal.name+" "+ animal2.name);
        animal = null; /*garbage collector tam burada devreye girer ve
        heap alanından animal objesini temizler. */
        animal2 = null; /* garbage collector*/




    }
}

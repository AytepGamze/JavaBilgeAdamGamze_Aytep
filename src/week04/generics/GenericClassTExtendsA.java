package week04.generics;

public class GenericClassTExtendsA <T extends String> {
    public void display(){
        System.out.println("This is a bounded type generics class");

    }

    public static void main(String[] args) {
        GenericClassTExtendsA<String> strObj= new GenericClassTExtendsA<String>();
        //GenericClassTExtendsA<String> intObj= new GenericClassTExtendsA<Integer>();
        //TODO KODLARI GİTHUB'DAN BAKARAK TAMAMLA :)

    }

}

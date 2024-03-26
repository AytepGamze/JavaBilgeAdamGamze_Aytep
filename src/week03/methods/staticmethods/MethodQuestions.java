package week03.methods.staticmethods;

import java.util.Scanner;

public class MethodQuestions {
    // Girilen bir tamsayının karesini alan bir method oluşturalım. Bu method non-static olsun. Daha sonra
    // kullanıcıdan 2 adet sayı isteyelim. Bu sayılardan küçük olan sayılardan başlayarak büyük olan sayıya kadar
    // aradaki bütün sayıların karesinin methodunu alalım ve yazdıralım.

    public static void main(String[] args) {
        MethodQuestions methodQuestions= new MethodQuestions();  // MethodQuestions() -> constructor meth
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz");
        int num1= scanner.nextInt(); // -> scanner.nextInt()+"\n";
        scanner.nextLine();
        System.out.print("2. sayiyi giriniz");
        int num2= Integer.parseInt(scanner.nextLine()); //Integer.parseInt("\n")

        int min;
        int max;
        if(num1>num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        for (int i = min; i<=max; i++) {
            //System.out.println(methodQuestions.getSquare(i));

        }

    }
}

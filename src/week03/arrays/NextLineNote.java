package week03.arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NextLineNote {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("lutfen yasinizi giriniz: ");
                int age= scanner.nextInt(); //scanner.nextInt()+"\n"
        scanner.nextLine();

        System.out.print("lutfen adinizi giriniz: ");
        String name= scanner.nextLine();
        System.out.println(age+ " " + name);
        System.out.println("lutfen yasinizi giriniz : ");
        int age2 = Integer.parseInt(scanner.nextLine()); //Scanner.nextInt()+ "\n";
        System.out.println(age2);
    }
}

package week03.methods;

public class VoidMethods {
    public static void main(String[] args) {
        sayHello("Gamze");
        sayHello("BilgeAdam");
        methodRankPoints(270.5);
    }

    public static void sayHello(String username) {
        System.out.println("Merhaba " + username.toUpperCase() + "! Hoş Geldin!");

    }


    public static void methodRankPoints(double points) {
        if ((points >= 202.5)) {
            System.out.println("Rank: A1");
        } else if (points >= 122.4) {
            System.out.println("Rank: A2");
        } else {
            System.out.println("Rank: A3");
        }

    }
}

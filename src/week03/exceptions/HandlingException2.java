package week03.exceptions;

public class HandlingException2 {
    public static void main(String[] args) {
        String name= null;

        System.out.println(name);
        try {
            name.toUpperCase();
            System.out.println("try blok ici");

        }
        catch(NullPointerException e){
            System.out.println("Caught NullPointerException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
        finally {
            System.out.println("hata bulunamiyor!");
        }
        System.out.println("kodun bitisi");
    }
} // TODO telefonda 26 mart , 14:36da çekilen fotoda kodun farklı versiyonu var, bakarak yaz.

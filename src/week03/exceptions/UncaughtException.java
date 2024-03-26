package week03.exceptions;

public class UncaughtException {
    public static void main(String[] args) {

    } public void method1(String name) {
        System.out.println("Method1");
        try {
            method2(name);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE!");
        }
        System.out.println("Method1 worked!");
    }
    public void method2(String name) {
        System.out.println("Method2");
        method3(name);
        System.out.println("Method2 didn't work!");
    }
    public void method3(String name) {
        System.out.println("Method3");
        name.toLowerCase();
        System.out.println("Method3 didn' work!");
    }
}
// TODO kodun devamı ve tamamı Alperen hocanın githubında var, ordan çek
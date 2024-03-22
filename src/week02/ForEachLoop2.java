package week02;

public class ForEachLoop2 {
    public static void main(String[] args) {
        //decleration, initialization
        int arr[] = {12,23,44,56,78};
        for (int i: arr) {
            int sum = i+10;
            if(i<50) {
                System.out.println("50'den kucuk");
            } else {
                System.out.println("50'den buyuk");
            }
            System.out.println("+10 eklemis hali :" + sum);
        }
    }
}


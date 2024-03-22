package week02;

public class ForEachLoop {
    public static void main(String[] args) {
        //decleration, initialization
        int arr[] = {12,23,44,56,78};
        for (int i: arr) {
            int sum = i+10;
            System.out.println(sum);
        }
    }
}

package week04.entityrelations.aggregation;

public class AggregationTest01 {
    public static void main(String[] args) {
       // Address address= new Address("2037","Ankara");
       // System.out.println(address);
        AggregateEmployee employee= new AggregateEmployee(1, "Gamze", new Address("2037", "Ankara"));
        System.out.println(employee);

    }
}

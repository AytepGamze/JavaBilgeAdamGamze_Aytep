package week03.exceptions;

public class UncheckedException {
    // runtime hatalari yani calisma zamaninda gerceklesen hatalar.
    public static void main(String[] args) {
        String name = null;
//        // kötü yaklaşım:
//        try{
//            if (name.equals("gamze")){
//                System.out.println("Name: gamze");
//            }
//
//        } catch(NullPointerException e){
//            System.out.println("Catch!");
//        }
        // eh işte idare eder, fena değil yaklaşımı:
//        if (name != null && name.equals("gamze")) {
//            System.out.println("name: gamze");
//        }
        // mukemmel,en iyi yontem
        if ("gamze".equals("name")) {
            System.out.println("name: gamze");
        }
// null degerler sadece objelere verilebilir.

    }
}


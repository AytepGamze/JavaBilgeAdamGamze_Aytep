package week03.constructor;

public class ConstructorOverloading {
    String country;
    String language;
    ConstructorOverloading(String country){ // parametreli constr.
        this.country = country;
    }
    ConstructorOverloading(){ //No-args-Constructer

    }


    public static void main(String[] args) {
        //no-args-constructor. Şu an herhangi bir constructor tanımlanmadı.
        // bu yüzden default contr. olarak bana no-args-constructor Java tarafından getirilir.
        ConstructorOverloading obj1 = new ConstructorOverloading();
        obj1.country= "Turkiye";
        obj1.language= "Turkish";
        System.out.println(obj1.country+" "+obj1.language);
        ConstructorOverloading obj2= new ConstructorOverloading("Korea");
        obj2.language= "Korean";
        System.out.println(obj2.country+" "+obj2.language);
        /*
        2.de parametreli constructor kullandık, fieldlardan birinin değerini nesneyi
        oluştururken arguman olarak verdik. Diğerini ise nesneyi oluşturduktan sonra dışarıdan atamasını yaptık.
         */

    } //TODO hocanın githubından eklemeleri yap.
}

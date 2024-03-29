package week03.oop.principles.encapsulation;

public class Person {

        private String name;
        private String lastname;

        private int age;
        private String tcKimlik;
        //Constructor
        //UserDefinedMethods
        //getter-setter methods
        //toString method.



    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    private String arabaSur() {
            if (age>=18){
                return name + " arabayi suruyor.";
            } else{
                return "araba surmeye yasiniz yetmiyor.";
            }

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
            System.out.println("yas 0'dan az olamaz.");
        } else if (age <= 18) {
            this.age=age;
            System.out.println("Ehliyet almak icin yasiniz tutmuyor." );
        } else {
            this.age = age;
            System.out.println("tebrikler!"+ arabaSur());
        }
    }

    }


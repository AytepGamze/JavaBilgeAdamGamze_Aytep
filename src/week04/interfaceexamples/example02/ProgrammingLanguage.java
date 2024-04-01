package week04.interfaceexamples.example02;

public class ProgrammingLanguage implements Language {


    @Override
    public void getname(String name) {
        System.out.println("programming language"+name);
    }
}

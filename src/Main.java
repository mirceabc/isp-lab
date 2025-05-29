import java.io.IOException;
import ro.ulbs.programare.lab1;
import ro.ulbs.programare.LitereAlfabet;
import ro.ulbs.paradigme.lab3.util.PasswordMaker;
import ro.ulbs.paradigme.lab2.Application;
import ro.ulbs.paradigme.lab4.Colectii;
import ro.ulbs.paradigme.lab5.File_IO;
import ro.ulbs.paradigme.lab6.CalculatorTest;

public class Main {

    private static void laborator1(){
        System.out.println("Laborator 1");
        lab1 l1 = new lab1();
        l1.HelloWorld();

        LitereAlfabet litere = new LitereAlfabet();
        litere.afisareLitere();

        l1.arrayStringLitereAlfabet();
        l1.afisareNumereMatrice();
    }

    private static void laborator2(String[] args){
        System.out.println("Laborator 2");
        Application.main(args);
    }

    private static void laborator3(){
        System.out.println("Laborator 3");
        PasswordMaker instance = PasswordMaker.getInstance();

        System.out.println("getInstance() was called " + PasswordMaker.getAccessCount() + " times");

        System.out.println("Generated password: " + instance.getPassword());
        System.out.println("Magic string used: " + instance.getMagicString());
    }

    private static void laborator4(){
        System.out.println("Laborator 4");
        Colectii.main(new String[]{});
    }

    private static void laborator5(){
        System.out.println("Laborator 5");
        try {
            File_IO.main(null);
            File_IO.generateRandomWordsFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void laborator6(){
        System.out.println("Laborator 6");
        CalculatorTest.main(new String[]{});
    }

    public static void main(String[] args) {
       laborator1();
       laborator2(args);
       laborator3();
       laborator4();
       laborator5();
       laborator6();
    }
}
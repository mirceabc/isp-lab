import ro.ulbs.programare.lab1;
import ro.ulbs.programare.LitereAlfabet;
import ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class Main {
    public static void main(String[] args) {
        lab1 l1 = new lab1();
        l1.HelloWorld();

        LitereAlfabet litere = new LitereAlfabet();
        litere.afisareLitere();

        l1.arrayStringLitereAlfabet();
        l1.afisareNumereMatrice();

        PasswordMaker instance = PasswordMaker.getInstance();

        System.out.println("getInstance() was called " + PasswordMaker.getAccessCount() + " times");

        System.out.println("Generated password: " + instance.getPassword());
        System.out.println("Magic string used: " + instance.getMagicString());
    }
}
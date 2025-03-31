package ro.ulbs.programare;

public class LitereAlfabet {

    public void afisareLitere(){

        for(int i = 'a'; i <= 'z'; i++){
            System.out.print((char)i + " ");
        }

        System.out.println();

        for(int i = 'A'; i <= 'Z'; i++){
            System.out.print((char)i + " ");
        }

    }

}

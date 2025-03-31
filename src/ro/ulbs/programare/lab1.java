package ro.ulbs.programare;

import java.util.Arrays;

public class lab1 {

    public void HelloWorld() {
        System.out.println("Hello, World!");
    }

    public void arrayStringLitereAlfabet() {

        StringBuilder alfabet = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++) {
            alfabet.append(c);
        }

        String vocale = "aeiou";
        String[] rezultat = new String[vocale.length()];

        int indexRezultat = 0;
        int startPozitie = 0;

        Arrays.fill(rezultat, "");

        for (int i = 0; i < alfabet.length(); i++) {
            char currentChar = alfabet.charAt(i);

            if (vocale.indexOf(currentChar) >= 0) {
                if (i > 0 && rezultat[indexRezultat].isEmpty()) {
                    startPozitie = i;
                }

                int urmatoareaVocala = -1;
                for (int j = i + 1; j < alfabet.length(); j++) {
                    if (vocale.indexOf(alfabet.charAt(j)) >= 0) {
                        urmatoareaVocala = j;
                        break;
                    }
                }

                if (urmatoareaVocala == -1) {
                    rezultat[indexRezultat] = alfabet.substring(startPozitie);
                } else {
                    rezultat[indexRezultat] = alfabet.substring(startPozitie, urmatoareaVocala);
                }

                indexRezultat++;
                startPozitie = i;

                if (indexRezultat >= rezultat.length) break;
            }
        }

        for (String s : rezultat) {
            System.out.println(s);
        }
    }

    public void afisareNumereMatrice()
    {
        int[] numere = {12, 3, 500, 1200, 50, 40, 100, 250, 8};

        for(int i=0; i<numere.length; i++)
        {
            System.out.print(numere[i] + " ");
            if((i+1)%3==0) {
                System.out.println();
            }
        }
    }
}

package ro.ulbs.paradigme.lab4;

import java.util.*;

public class Student {
    private String nume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void adaugaNota(int nota) {
        note.add(nota);
    }

    public boolean esteIntegralist() {
        for (int n : note) {
            if (n < 5) return false;
        }
        return true;
    }

    public float getMedie() {
        int sum = 0;
        for (int n : note) sum += n;
        return note.isEmpty() ? 0 : (float) sum / note.size();
    }

    public int getNrRestante() {
        int cnt = 0;
        for (int n : note) if (n < 5) cnt++;
        return cnt;
    }

    @Override
    public String toString() {
        return nume + " | Grupa: " + grupa + " | Note: " + note + " | Medie: " + String.format("%.2f", getMedie()) + " | Restante: " + getNrRestante();
    }
}

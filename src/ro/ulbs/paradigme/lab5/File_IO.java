package ro.ulbs.paradigme.lab5;

import java.io.*;
import java.util.*;

public class File_IO {

    public static void main(String[] args) throws IOException {
        // a)
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("in.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line + "\n");
            }
        }
        System.out.println("a) ");
        for (String l : lines) System.out.print(l);

        // b)
        List<String> punctuated = new ArrayList<>();
        for (String l : lines) {
            StringBuilder sb = new StringBuilder();
            for (char c : l.toCharArray()) {
                sb.append(c);
                if (c == '.') sb.append('\n');
            }
            punctuated.add(sb.toString());
        }
        System.out.println("\nb)");
        for (String l : punctuated) System.out.print(l);

        // c)
        try (PrintWriter pw = new PrintWriter("out.txt")) {
            pw.println("a)");
            for (String l : lines) pw.print(l);
            pw.println("\nb)");
            for (String l : punctuated) pw.print(l);
        }
    }

    public static void generateRandomWordsFile() throws IOException {
        Random rand = new Random();
        try (PrintWriter pw = new PrintWriter("outrand.txt")) {
            for (int i = 0; i < 5; i++) {
                List<String> words = new ArrayList<>();
                for (int j = 0; j < 10; j++) {
                    StringBuilder sb = new StringBuilder();
                    for (int k = 0; k < 4; k++) {
                        char c = (char) ('a' + rand.nextInt(26));
                        sb.append(c);
                    }
                    words.add(sb.toString());
                }
                Collections.sort(words);
                pw.println(String.join(" ", words));
            }
        }
    }

}

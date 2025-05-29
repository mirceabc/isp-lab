package ro.ulbs.paradigme.lab9;

import java.util.*;
import java.util.stream.*;

public class lab9 {

    public static void main(String[] args) {
        // 9.3.1
        Random random = new Random();
        List<Integer> numbers = IntStream.range(0, 10)
                .map(i -> 5 + random.nextInt(21))
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Lista: " + numbers);

        // a)
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Suma: " + sum);

        // b)
        int max = numbers.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElseThrow();
        System.out.println("Max: " + max + ", Min: " + min);

        // c)
        List<Integer> filtered = numbers.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("Filtrare [10..20]: " + filtered);

        // d)
        List<Double> doubles = numbers.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());
        System.out.println("Transformare Double: " + doubles);

        // e)
        boolean contains12 = numbers.contains(12);
        System.out.println("Contine 12: " + contains12);

        // 9.3.2
        List<Integer> list2 = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> squaresDistinct = list2.stream()
                .map(n -> n * n)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Patrate Distincte: " + squaresDistinct);

        // 9.3.3
        String text = "Acesta este un program scris cu java 8 si expresii lambda";
        List<String> words = Arrays.asList(text.split(" "));

        // a)
        List<String> longWords = words.stream()
                .filter(w -> w.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Cuvant >=5 charactere: " + longWords);
        System.out.println("Numar: " + longWords.size());

        // b)
        List<String> sorted = new ArrayList<>(longWords);
        sorted.sort(Comparator.naturalOrder());
        System.out.println("Sortare: " + sorted);

        // c)
        Optional<String> startsWithP = longWords.stream()
                .filter(w -> w.startsWith("p"))
                .findFirst();
        System.out.println("Cuvant care incepe cu 'p': " + startsWithP.orElse("None"));
    }
}

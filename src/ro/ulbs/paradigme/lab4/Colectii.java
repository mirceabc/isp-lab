package ro.ulbs.paradigme.lab4;

import java.util.*;

public class Colectii {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();

        for (int i = 0; i < 5; i++) x.add(rand.nextInt(11));
        for (int i = 0; i < 7; i++) y.add(rand.nextInt(11));

        // Sort x and y
        Collections.sort(x);
        Collections.sort(y);

        // a) xPlusY
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        // b) zSet
        Set<Integer> setX = new HashSet<>(x);
        Set<Integer> setY = new HashSet<>(y);
        for (Integer val : setX) {
            if (setY.contains(val)) zSet.add(val);
        }

        // c) xMinusY
        for (Integer val : x) {
            if (!y.contains(val)) xMinusY.add(val);
        }

        // d) xPlusYLimitedByP
        for (Integer val : xPlusY) {
            if (val <= p) xPlusYLimitedByP.add(val);
        }

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("xPlusY: " + xPlusY);
        System.out.println("zSet: " + zSet);
        System.out.println("xMinusY: " + xMinusY);
        System.out.println("xPlusYLimitedByP: " + xPlusYLimitedByP);
    }
}

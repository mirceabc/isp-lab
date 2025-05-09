package ro.ulbs.paradigme.lab2;

import ro.ulbs.paradigme.lab2.api.MyList;
import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;

public class Application {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        System.out.println("Area = " + tri.getArea() + " details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        Triangle tri2 = new Triangle(1.1F, 2.0F, "red");
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));

        Triangle tri3 = new Triangle(1.1F, 2.0F, "brown");
        System.out.println("Triangle3 equals to Triangle1: " + tri.equals(tri3));

        MyList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) simpleList.addValue(i);
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        System.out.print("Simple chained list: ");
        simpleList.listNodes();
        System.out.println("Is simple list sorted? " + simpleList.isSorted());

        MyList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) doubleList.addValue(i);
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        System.out.print("Double chained list: ");
        doubleList.listNodes();
        System.out.println("Is double list sorted? " + doubleList.isSorted());

        System.out.println("Sum of simple chained list: " + simpleList.sumValues());
        System.out.println("Sum of double chained list: " + doubleList.sumValues());
    }
}

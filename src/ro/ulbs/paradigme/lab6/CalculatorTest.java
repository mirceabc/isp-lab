package ro.ulbs.paradigme.lab6;

public class CalculatorTest {
    public static void main(String[] args) {
        // 5.4.1
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("5.4.1 a) " + result);

        // 5.4.2
        NewIntCalculator newCalc = new NewIntCalculator(10);
        int result2 = (Integer) newCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("5.4.2 a) " + result2);

        DoubleCalculator fCalculator = new DoubleCalculator(10);
        double result3 = (Double) fCalculator.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("5.4.2 b) " + result3);
    }
}

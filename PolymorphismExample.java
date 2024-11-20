class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3)); 
        System.out.println("Sum of 1, 2, and 3: " + calculator.add(1, 2, 3)); 
        System.out.println("Sum of 1.5 and 2.5: " + calculator.add(1.5, 2.5)); 
    }
}

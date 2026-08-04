class Calculator {
    static int power(int num1, int num2) {
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * num1;
        }
        return result;
    }
    static double power(double num1, int num2) {
        double result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * num1;
        }
        return result;
    }
}
public class Student {
    public static void main(String[] args) {
        int result1 = Calculator.power(2, 5);
        System.out.println("2^5 = " + result1);
        double result2 = Calculator.power(2.5, 3);
        System.out.println("2.5^3 = " + result2);
    }
}
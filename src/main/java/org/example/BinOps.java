package org.example;

public class BinOps {
    String acceptablePattern = "[01]+";

    public String sum(String a, String b) {
        if (a.matches(acceptablePattern) && b.matches(acceptablePattern)) {
            System.out.println("Первое число равно " + a);
            int firstOperand = Integer.parseInt(a, 2);
            System.out.println("Второе число равно " + b);
            int secondOperand = Integer.parseInt(b, 2);
            int result = firstOperand + secondOperand;
            return Integer.toBinaryString(result);
        } else {
            throw new NumberFormatException("Работаем только с 0 и 1, остальные цифры не допустимы");
        }
    }

    public String mult(String a, String b) {
        if (a.matches(acceptablePattern) && b.matches(acceptablePattern)) {
            System.out.println("Первое число равно " + a);
            int firstOperand = Integer.parseInt(a, 2);
            System.out.println("Второе число равно " + b);
            int secondOperand = Integer.parseInt(b, 2);
            int result = firstOperand * secondOperand;
            return Integer.toBinaryString(result);
        } else {
            throw new NumberFormatException("Работаем только с 0 и 1, остальные цифры не допустимы");
        }
    }
}

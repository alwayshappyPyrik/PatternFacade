package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        System.out.println("Результат сложения равен: " + binOps.sum("101", "111"));
        System.out.println("Результат умножения равен: " + binOps.mult("1001", "1100"));
    }
}
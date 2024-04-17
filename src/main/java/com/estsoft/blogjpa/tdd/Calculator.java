package com.estsoft.blogjpa.tdd;

public class Calculator {
    public static void main(String[] args) {
        // 계산기 - 덧샘
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2) == 3);        // true
    }

    private int sum(int i, int i1) {
        return i + i1;
    }
}

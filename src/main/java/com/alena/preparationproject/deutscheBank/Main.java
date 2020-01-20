package com.alena.preparationproject.deutscheBank;

import java.util.stream.IntStream;

public class Main {

    //вывести до 100 все натуральные числа в квадрате
    private static void getNumbers() {
        IntStream.range(1, 100)
                .filter(el -> el % 2 == 0)
                .forEach(el -> System.out.println(el * el));
    }

    public static void main(String[] args) {
        getNumbers();
    }
}

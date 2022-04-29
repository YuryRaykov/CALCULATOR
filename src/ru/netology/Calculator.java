package ru.netology;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;



    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y; //
    BinaryOperator<Integer> multiply = (x, y) -> x * y; //
    //UnaryOperator<Integer> abs = x -> x > 0 ? x : -1;
    BinaryOperator<Integer> devide = (x, y) -> x / y; //

    UnaryOperator<Integer> pow = x -> x * x; //
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1; // здесь мы если х = 0 возвращаем ноль, т.е. по сути ничего не меням
    //UnaryOperator<Integer> abs = x -> x == 0 ? -1 : x; // немного переработав строку выше мы при значении х=0 присваиваем ему -1
    // тем самым исключаем деление на 0 в методе main

    Predicate<Integer> isPositive = x -> x > 0; //
    Predicate<Integer> isPositive1 = y -> y > 0;

    Consumer<Integer> println = System.out::println; //
}

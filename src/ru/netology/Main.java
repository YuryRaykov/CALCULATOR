package ru.netology;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get(); //

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); // в результате указанных значений b = 0

        //b = calc.abs.apply(b);// здесь мы вызываем интерфейс abs тем самым проверя его на 0 и если значение 0,
        // то присваиваем -1

        int c = calc.devide.apply(a, b); // на 0 делить нельзя (так как b = 0 из условий выше)
        // можно или изменить значения при реализации b, присвоить b другое значение (через вызов интерфейса abs)
        // или сделать исключение вывод ошибки что на 0 делить нельзя

        calc.println.accept(c); //



    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0409;

/*Ближайшее к 10
Напишите метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.

Подсказка:
используйте метод public static int abs(int a), который возвращает абсолютную величину числа.


Требования:
1. Программа должна выводить числа на экран.
2. Метод main не должен вызывать System.out.println() или System.out.print().
3. Метод main должен вызывать метод displayClosestToTen.
4. Метод displayClosestToTen должен вызывать метод abs.
5. Метод displayClosestToTen должен выводить число на экран согласно заданию.
 */
/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        if(abs(10 -a) > abs(10 - b)){
            System.out.println(b);
        }
        else if(abs(10 -a) < abs(10 - b)){
            System.out.println(a);
        }
        else if(abs(10 -a) == abs(10 - b)){
            System.out.println(a);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

}

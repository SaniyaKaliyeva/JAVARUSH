/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level01.Task0132;

/*Сумма цифр трехзначного числа
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
3. Метод sumDigitsInNumber должен возвращать значение типа int.
4. Метод sumDigitsInNumber не должен ничего выводить на экран.
5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
 */
/* 
Сумма цифр трехзначного числа
*/



public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String sNumber = String.valueOf(number);
        String sNumber1 = sNumber.substring(0,1);
        int iNumber1 = Integer.parseInt(sNumber1);
        String sNumber2 = sNumber.substring(1,2);
        int iNumber2 = Integer.parseInt(sNumber2);
        String sNumber3 = sNumber.substring(2);
        int iNumber3 = Integer.parseInt(sNumber3);
        return iNumber1+iNumber2+iNumber3;
    }
}

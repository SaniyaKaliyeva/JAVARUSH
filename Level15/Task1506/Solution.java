/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15.Task1506;

/*Что-то лишнее
1. Программа должна выводить следующее:
Это double
Это Object
Это double
Это Integer
Это double

2. Удали реализации всех лишних методов


Требования:
1. В классе Solution должен остаться метод print с одним параметром типа Integer.
2. В классе Solution должен остаться метод print с одним параметром типа Object.
3. В классе Solution должен остаться метод print с одним параметром типа double.
4. Вывод на экран должен соответствовать условию.
 */
/* 
Что-то лишнее
*/

public class Solution {
    public static void main(String[] args) {
        print((double) 1);
        print((Number) 1);
        print((double) 1);
        print((Integer) 1);
        print((double) 1);
    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

    public static void print(int i) { System.out.println("Это Integer"); }

    public static void print(Short i) { System.out.println("Это Object"); }

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }

    public static void print(Double i) { System.out.println("Это double"); }

    public static void print(float i) { System.out.println("Это Double"); }
}


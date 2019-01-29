/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0417;

/*Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
 */
/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1 == number2 && number2 == number3){
            System.out.println(number1 + " " + number2 + " " + number3);
        }
        else if(number1 == number2 && number2 != number3){
            System.out.println(number1 + " " + number2);
        }
        else if(number2 == number3 && number1 != number2){
            System.out.println(number2 + " " + number3);
        }
        else if(number1 == number3 && number3 != number2){
            System.out.println(number1 + " " + number3);
        }
    }
}

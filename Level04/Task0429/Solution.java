/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0429;

/*Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример: 
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример: 
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить количество отрицательных чисел в исходном наборе.
4. Программа должна выводить количество положительных чисел в исходном наборе.
5. Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
6. Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
7. Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
 */
/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        if(number1==0 && number2 == 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 0");
        }
        else if(number1>0 && number2 == 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1<0 && number2 == 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 0");
        }
        else if(number1==0 && number2 > 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1==0 && number2 < 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 0");
        }
        else if(number1==0 && number2 == 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1==0 && number2 == 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 0");
        }
        else if(number1==0 && number2 > 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 2");
        }
        else if(number1==0 && number2 < 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 0");
        }
        else if(number1==0 && number2 > 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1==0 && number2 < 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1>0 && number2 == 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 2");
        }
        else if(number1<0 && number2 == 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 0");
        }
        else if(number1>0 && number2 == 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1<0 && number2 == 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1>0 && number2 > 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 2");
        }
        else if(number1<0 && number2 < 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 0");
        }
        else if(number1<0 && number2 > 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1>0 && number2 < 0 && number3 == 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1>0 && number2 > 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 3");
        }
        else if(number1<0 && number2 > 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");
        }
        else if(number1>0 && number2 < 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");
        }
        else if(number1>0 && number2 > 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");
        }
        else if(number1<0 && number2 < 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 3");
            System.out.println("количество положительных чисел: 0");
        }
        else if(number1<0 && number2 < 0 && number3 > 0){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1<0 && number2 > 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");
        }
        else if(number1>0 && number2 < 0 && number3 < 0){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");
        }

    }
}


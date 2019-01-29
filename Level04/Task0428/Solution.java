/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0428;

/*Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
5. Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
 */
/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

            if(number1>0 && number2>0 && number3>0){
                System.out.println("3");
            }
            else if(number1<0 && number2<0 && number3<0){
                System.out.println("0");
            }
            else if(number1>0 && number2>0 && number3<0){
                System.out.println("2");
            }
            else if(number1>0 && number2<0 && number3>0){
                System.out.println("2");
            }
            else if(number1<0 && number2>0 && number3>0){
                System.out.println("2");
            }
            else if(number1>0 && number2<0 && number3<0){
                System.out.println("1");
            }
            else if(number1<0 && number2>0 && number3<0){
                System.out.println("1");
            }
            else if(number1<0 && number2<0 && number3>0){
                System.out.println("1");
            }
            else if(number1==0 && number2>0 && number3>0){
                System.out.println("2");
            }
            else if(number1==0 && number2>0 && number3<0){
                System.out.println("1");
            }
            else if(number1==0 && number2<0 && number3>0){
                System.out.println("1");
            }
            else if(number1==0 && number2<0 && number3<0){
                System.out.println("0");
            }
            else if(number1>0 && number2==0 && number3>0){
                System.out.println("2");
            }
            else if(number1<0 && number2==0 && number3>0){
                System.out.println("1");
            }
            else if(number1>0 && number2==0 && number3<0){
                System.out.println("1");
            }
            else if(number1<0 && number2==0 && number3<0){
                System.out.println("0");
            }
            else if(number1>0 && number2>0 && number3==0){
                System.out.println("2");
            }
            else if(number1>0 && number2<0 && number3==0){
                System.out.println("1");
            }
            else if(number1<0 && number2>0 && number3==0){
                System.out.println("1");
            }
            else if(number1<0 && number2<0 && number3==0){
                System.out.println("0");
            }
            else if(number1==0 && number2==0 && number3==0){
                System.out.println("0");
            }
            else if(number1==0 && number2==0 && number3>0){
                System.out.println("1");
            }
            else if(number1==0 && number2==0 && number3<0){
                System.out.println("0");
            }
            else if(number1>0 && number2==0 && number3==0){
                System.out.println("1");
            }
            else if(number1<0 && number2==0 && number3==0){
                System.out.println("0");
            }
            else if(number1==0 && number2>0 && number3==0){
                System.out.println("1");
            }
            else if(number1==0 && number2<0 && number3==0){
                System.out.println("0");
            }


    }
}


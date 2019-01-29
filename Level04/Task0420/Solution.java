/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0420;

/*Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
 */
/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        if(num1>num2 && num2>num3){
            System.out.println(num1+" "+num2+" "+num3);
        }
        else if(num2>num1 && num1>num3){
            System.out.println(num2+" "+num1+" "+num3);
        }
        else if(num3>num1 && num1>num2){
            System.out.println(num3+" "+num1+" "+num2);
        }
        else if(num2>num3 && num3>num1){
            System.out.println(num2+" "+num3+" "+num1);
        }
        else if(num3>num2 && num2>num1){
            System.out.println(num3+" "+num2+" "+num1);
        }
        else if(num1>num3 && num3>num2){
            System.out.println(num1+" "+num3+" "+num2);
        }
        else if(num1==num2 && num2==num3){
            System.out.println(num1+" "+num2+" "+num3);
        }
        else if(num1==num2 && num1>num3){
            System.out.println(num1+" "+num2+" "+num3);
        }
        else if(num1==num2 && num1<num3){
            System.out.println(num3+" "+num1+" "+num2);
        }
        else if(num1==num3 && num1>num2){
            System.out.println(num1+" "+num3+" "+num2);
        }
        else if(num1==num3 && num1<num2){
            System.out.println(num2+" "+num1+" "+num3);
        }
        else if(num2==num3 && num2>num1){
            System.out.println(num2+" "+num3+" "+num1);
        }
        else if(num2==num3 && num2<num1){
            System.out.println(num1+" "+num2+" "+num3);
        }
    }
}


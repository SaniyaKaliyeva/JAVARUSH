/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0441;

/*Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
 */
/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        if(num1 > num2 && num2 > num3){
            System.out.println(num2);
        }
        else if(num3 > num2 && num2 > num1){
            System.out.println(num2);
        }
        else if(num2 > num1 && num1 > num3){
            System.out.println(num1);
        }
        else if(num3 > num1 && num1 > num2){
            System.out.println(num1);
        }
        else if(num1 > num3 && num3 > num2){
            System.out.println(num3);
        }
        else if(num2 > num3 && num3 > num1){
            System.out.println(num3);
        }
        else if(num1 == num2 && num2 == num3){
            System.out.println(num1);
        }
        else if(num1 == num2 && num1 > num3){
            System.out.println(num1);
        }
        else if(num1 == num2 && num1 < num3){
            System.out.println(num1);
        }
        else if(num1 == num3 && num3 > num2){
            System.out.println(num3);
        }
        else if(num1 == num3 && num3 < num2){
            System.out.println(num3);
        }
        else if(num2 == num3 && num2 > num1){
            System.out.println(num2);
        }
        else if(num2 == num3 && num2 < num1){
            System.out.println(num2);
        }

    }
}


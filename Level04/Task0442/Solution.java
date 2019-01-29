/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0442;

/*Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказака: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
4. В программе должен использоваться цикл for, while или do-while.
 */
/* 
Суммирование
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            sum = sum + number;
            if (number == -1){
                System.out.println(sum);
                break;
            }
        }

    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0432;

/*Хорошего много не бывает
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв


Требования:
1. Программа должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Каждое значение должно быть выведено с новой строки.
4. Программа должна выводить на экран строку N раз.
5. В программе должен использоваться цикл while.
 */
/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        while (n>0){
            System.out.println(line);
            n--;
        }

    }
}


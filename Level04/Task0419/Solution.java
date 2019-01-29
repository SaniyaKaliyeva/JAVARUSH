/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0419;

/*Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.
 */
/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    static int Compare() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
    public static void main(String[] args) throws Exception {
        int x = Compare();
        int y = Compare();
        if(x > y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }

    }
}

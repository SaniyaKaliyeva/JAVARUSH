/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0435;

/*Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.


Требования:
1. Программа не должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить чётные числа от 1 до 100 включительно. Каждое значение вывести с новой строки.
4. В программе должен использоваться цикл for.
 */
/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}


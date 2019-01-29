/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0438;

/*Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.


Требования:
1. Программа не должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить горизонтальную линию из 10 восьмёрок.
4. Программа должна выводить вертикальную линию из 10 восьмёрок.
5. В программе должен использоваться цикл for.
 */
/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for(int i=1; i<=10; i++){
            System.out.print(8);
        }
        for(int j=1; j<=10; j++){
            System.out.println(8);
        }

    }
}


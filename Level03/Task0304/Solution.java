/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level03.Task0304;

/*Задача на проценты
Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

Пример:
return 123 * 435;


Требования:
1. Метод addTenPercent должен увеличивать переданное число на 10% процентов.
2. Метод main должен вызывать метод addTenPercent.
3. Метод main должен выводить результаты вызова на экран.
4. Метод addTenPercent не должен ничего выводить на экран.
 */
/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double n;
        n = i + i * 10.0/ 100;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}


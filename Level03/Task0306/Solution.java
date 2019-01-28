/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level03.Task0306;

/*Головоломка со скобками
Расставить правильно (по другому) скобки, чтобы на экран вывелось число 382


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод main должен содержать только один вызов System.out.println.
3. Последовательность цифр и арифметических операций изменять нельзя.
4. Количество круглых скобок должно остаться прежним (2 открывающие и 2 закрывающие).
5. Метод main должен выводить на экран число 382.
 */
/* 
Головоломка со скобками
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(1 + 2 * (3 + 4 * (5 + 6 * 7) + 8 * 9) + 10);
    }
}

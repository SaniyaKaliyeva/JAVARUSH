/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15.Task1508;

/*ООП - Перегрузка - убираем лишнее
1. Подумайте, какая из реализаций метода print будет вызвана.
2. Удалите все лишние реализации метода print.


Требования:
1. В классе Solution кроме метода main должен остаться только один метод print(с правильным параметром!).
2. Метод print должен быть публичным.
3. Метод print должен быть статическим.
4. Программа должна выводить на экран строку "Я буду Java прогером!".
 */
/* 
ООП - Перегрузка - убираем лишнее
*/

public class Solution {
    public static void main(String[] args) {
        print(1);
    }

//    public static void print(byte b) { System.out.println("Я буду Java прогером!"); }

//    public static void print(double d) { System.out.println("Я буду Java прогером!"); }

    public static void print(long l) {
        System.out.println("Я буду Java прогером!");
    }

 //   public static void print(float f) { System.out.println("Я буду Java прогером!"); }

  //  public static void print(char c) { System.out.println("Я буду Java прогером!"); }
}


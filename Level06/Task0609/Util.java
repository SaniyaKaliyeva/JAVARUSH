/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level06.Task0609;

/*Расстояние между двумя точками
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.


Требования:
1. Метод getDistance должен возвращать double.
2. Метод getDistance должен быть статическим.
3. Метод getDistance должен быть public.
4. Метод getDistance должен возвращать расстояние между точками.
5. Метод getDistance должен использовать метод double Math.sqrt(double a).
 */
/* 
Расстояние между двумя точками
*/


public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1) * (y2 - y1));
        return a;
    }

    public static void main(String[] args) {

    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15.Task1513;

/*Максимально простой код-3
Упрости код:
- убери всё то, что будет генерироваться автоматически при компиляции
- убери все наследования классов, которые и так будут добавлены автоматически при компиляции
- убери все конструкторы, которые создаются и добавляются автоматически.


Требования:
1. В классе Car не должно быть явно реализованных конструкторов без параметров.
2. В классе Machine не должно быть явно реализованных конструкторов без параметров.
3. Класс Car должен быть потомком класса Machine.
4. В коде не должно быть явного наследования от Object (extends Object).
5. Класс Car не должен явно наследовать интерфейс Runnable.
 */
/* 
Максимально простой код-3
*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {
//        public Machine() { super(); }
    }

    public class Car extends Machine {
//        public Car() { super(); }
    }
}


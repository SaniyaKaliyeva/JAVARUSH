/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level16.Task1626;

/*Создание по образцу
Разберись, как работает программа.
По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number.


Требования:
1. Класс CountUpRunnable должен реализовывать интерфейс Runnable.
2. Класс CountUpRunnable должен иметь публичный метод run без параметров.
3. Метод run класса CountUpRunnable должен работать примерно 2,5 секунды.
4. Метод run класса CountUpRunnable должен каждые полсекунды выводить имя потока, двоеточие и значение счетчика от 1 до 5 (например: "Увеличиваем: 1").
5. Метод run класса CountUpRunnable должен вызывать Thread.sleep(500).
 */
import java.sql.SQLOutput;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        //Add your code here - добавь код тут
        private int countIndexUp = 0;

        public void run(){
                try {
                    while (true) {
                        countIndexUp+=1;
                        System.out.println(toString());
                        Thread.sleep(500);
                        if (countIndexUp == Solution.number) return;
                    }
                } catch (InterruptedException e) {
                }
        }

        public String toString() { return Thread.currentThread().getName() + ": " + countIndexUp;}
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15.Task1501;

/*ООП - Расставить интерфейсы
1. Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
2. Реализуй их методы.


Требования:
1. Класс Clothes должен поддерживать интерфейс Movable.
2. Класс Clothes должен поддерживать интерфейс Sellable.
3. Класс Clothes должен поддерживать интерфейс Discountable.
4. В классе Clothes должен быть реализован метод isMovable.
5. В классе Clothes должен быть реализован метод getAllowedAction без параметров.
6. В классе Clothes должен быть реализован метод getAllowedAction с одним параметром типа String.
 */
/* 
ООП - Расставить интерфейсы
*/

import javax.swing.*;

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable{
        public boolean isMovable(){
            return true;
        }

        public Object getAllowedAction(String name){
            return "Name";
        }

        public Object getAllowedAction(){
            return this;
        }
    }
}


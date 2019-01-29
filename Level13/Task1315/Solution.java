/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level13.Task1315;

/*Том, Джерри и Спайк
1. Создай классы Dog, Cat и Mouse.
2. Реализуй интерфейсы в добавленных классах, учитывая что:
- Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь(Mouse) может передвигаться и может быть съедена.
- Собака(Dog) может передвигаться и съесть кого-то.


Требования:
1. Класс Cat должен быть объявлен внутри класса Solution.
2. Класс Dog должен быть объявлен внутри класса Solution.
3. Класс Mouse должен быть объявлен внутри класса Solution.
4. Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
5. Мышь(Mouse) может передвигаться и может быть съедена.
6. Собака(Dog) может передвигаться и съесть кого-то.
 */
/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    class Dog implements Movable, Eat{
        public void move(){
            System.out.println("I can move");
        }

        public void eat(){
            System.out.println("I can eat");
        }
    }

    class Cat implements Movable, Edible, Eat{
        public void move(){
            System.out.println("I can move");
        }

        public void beEaten(){
            System.out.println("I can be eaten");
        }

        public void eat(){
            System.out.println("I can eat");
        }
    }

    class Mouse implements Movable, Edible{
        public void move(){
            System.out.println("I can move");
        }

        public void beEaten(){
            System.out.println("I can be eaten");
        }
    }
}

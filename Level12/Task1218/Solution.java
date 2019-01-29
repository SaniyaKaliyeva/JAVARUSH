/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level12.Task1218;

/*Есть, летать и двигаться
Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).


Требования:
1. Класс Solution должен содержать интерфейс CanFly с одним методом fly().
2. Класс Solution должен содержать интерфейс CanMove с одним методом move().
3. Класс Solution должен содержать интерфейс CanEat с одним методом eat().
4. Собака должна уметь передвигаться и есть.
5. Автомобиль должен уметь передвигаться.
6. Самолет должен уметь передвигаться и летать.
7. Утка должна уметь передвигаться, летать и есть.
 */
/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove{
        public void eat(){
            System.out.println("I'm eating");
        }
        public void move(){
            System.out.println("I can move");
        }
    }

    public class Duck implements CanEat, CanMove, CanFly{
        public void eat(){
            System.out.println("I'm eating");
        }
        public void move(){
            System.out.println("I can move");
        }
        public void fly(){
            System.out.println("I can fly");
        }
    }

    public class Car implements CanMove{
        public void move(){
            System.out.println("I can move");
        }
    }

    public class Airplane implements CanFly, CanMove{
        public void fly(){
            System.out.println("I can fly");
        }
        public void move(){
            System.out.println("I can move");
        }
    }
}


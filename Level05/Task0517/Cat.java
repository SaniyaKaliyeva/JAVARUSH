/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level05.Task0517;

/*Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.


Требования:
1. У класса Cat должна быть переменная name с типом String.
2. У класса Cat должна быть переменная age с типом int.
3. У класса Cat должна быть переменная weight с типом int.
4. У класса Cat должна быть переменная address с типом String.
5. У класса Cat должна быть переменная color с типом String.
6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
 */
/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat(String name){
        this.name = name;
        this.address = null;
        this.color = "grey";
        this.age = 1;
        this.weight = 1;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "red";
        this.weight = 5;
    }
    public Cat(int weight, String  color){
        this.color = color;
        this.age = 5;
        this.weight = weight;
    }
    public Cat(int weight, String  color, String address){
        this.address = address;
        this.color = color;
        this.age = 11;
        this.weight = weight;
    }


    public static void main(String[] args) {

    }
}


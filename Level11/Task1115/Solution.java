/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level11.Task1115;

/*От школьника до квалифицированного раба
Изменить четыре класса: Schoolboy (школьник), Student (студент), Worker (Сотрудник), Slave (Раб).
Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.


Требования:
1. В классе Solution должен быть public класс Schoolboy (школьник).
2. В классе Solution должен быть public класс Student (студент).
3. В классе Solution должен быть public класс Worker (Сотрудник).
4. В классе Solution должен быть public класс Slave (Раб).
5. Класс Student должен быть унаследован от класса Schoolboy.
6. Класс Worker должен быть унаследован от класса Student.
7. Класс Slave должен быть унаследован от класса Worker.
 */
/* 
От школьника до квалифицированного раба
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Schoolboy {
        private String name;
        private int age;
        private String subject;

        public Schoolboy(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void go(){
            System.out.println("Go to school");
        }
    }

    public class Student extends Schoolboy{
        public Student(String name, int age){
            super(name, age);
        }
        @Override
        public void go(){
            System.out.println("Go to university");
        }
    }

    public class Worker extends Student{
        public Worker(String name, int age){
            super(name, age);
        }

        @Override
        public void go(){
            System.out.println("Go to work");
        }
    }

    public class Slave extends Worker{
        public Slave(String name, int age){
            super(name, age);
        }

        @Override
        public void go(){
            System.out.println("Go to prison");
        }
    }

}


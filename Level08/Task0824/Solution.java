/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level08.Task0824;

/*Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
 */
/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("child1", true, 13));
        children.add(new Human("child2", true, 15));
        children.add(new Human("child3", false, 17));

        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();
        parents1.add(new Human("father", true, 44, children));
        parents2.add(new Human("mother", false, 43, children));

        ArrayList<Human> grandParents = new ArrayList<>();
        grandParents.add(new Human("grandFather1", true, 77, parents1));
        grandParents.add(new Human("grandMother1", false, 77, parents1));
        grandParents.add(new Human("grandFather2", true, 75, parents2));
        grandParents.add(new Human("grandMother2", false, 77, parents2));

        for(Human x : children){
            System.out.println(x);
        }

        for(Human x : parents1){
            System.out.println(x);
        }

        for(Human x : parents2){
            System.out.println(x);
        }

        for(Human x : grandParents){
            System.out.println(x);
        }

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();
        Human(String name, boolean sex, int age){
            this.name= name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}


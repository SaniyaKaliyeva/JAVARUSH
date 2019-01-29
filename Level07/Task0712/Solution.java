/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level07.Task0712;

/*Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexMin = 0;
        int indexMax = 0;

        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() < min){
                min = list.get(i).length();
                indexMin = i;
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() > max){
                max = list.get(i).length();
                indexMax = i;
            }
        }

        if(indexMin < indexMax){
            System.out.println(list.get(indexMin));
        }
        else{
            System.out.println(list.get(indexMax));
        }

    }
}


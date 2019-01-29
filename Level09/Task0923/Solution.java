/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level09.Task0923;

/*Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить две строки.
3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
5. Каждая строка должна заканчиваться пробелом.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();
        String words2 = words.replaceAll(" ", "");

        ArrayList<Character> vowelList = new ArrayList<>();
        ArrayList<Character> consonantList = new ArrayList<>();

        for(int i = 0 ; i < words2.length(); i++){
            if(isVowel(words2.charAt(i))){
                vowelList.add(words2.charAt(i));
            }
            else {
                consonantList.add(words2.charAt(i));
            }
        }

        String justVowel = "";
        for(int i = 0 ; i < vowelList.size(); i++){
            justVowel = justVowel + Character.toString(vowelList.get(i)) + " ";
        }

        String justConsonant = "";
        for(int i = 0 ; i < consonantList.size(); i++){
            justConsonant = justConsonant + Character.toString(consonantList.get(i)) + " ";
        }
        System.out.println(justVowel);
        System.out.println(justConsonant);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}

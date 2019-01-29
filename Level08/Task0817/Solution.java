/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level08.Task0817;

/*Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> people = new HashMap<String, String>();
        people.put("lastName1", "firstName1");
        people.put("lastName2", "firstName1");
        people.put("lastName3", "firstName3");
        people.put("lastName4", "firstName4");
        people.put("lastName5", "firstName5");
        people.put("lastName6", "firstName7");
        people.put("lastName7", "firstName7");
        people.put("lastName8", "firstName8");
        people.put("lastName9", "firstName9");
        people.put("lastName0", "firstName0");

        return people;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> removeValues = new ArrayList<>();

        ArrayList<String> copy1 = new ArrayList<>(map.values());
        ArrayList<String> copy2 = new ArrayList<>(map.values());

        for (String s1: copy1) {
            int count = 0;
            for(String s2 : copy2){
                if(s1.equals(s2)){
                    count++;
                }
                if(count > 1){
                    removeValues.add(s1);
                    break;
                }
            }
        }
        for(String s3 : removeValues){
            removeItemFromMapByValue(map, s3);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());

    }
}


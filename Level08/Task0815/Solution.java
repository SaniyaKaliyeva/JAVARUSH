/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level08.Task0815;

/*Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> human = new HashMap<>();
        human.put("LastName1", "FistName1");
        human.put("LastName2", "FistName2");
        human.put("LastName3", "FistName3");
        human.put("LastName4", "FistName4");
        human.put("LastName5", "FistName5");
        human.put("LastName6", "FistName6");
        human.put("LastName7", "FistName7");
        human.put("LastName8", "FistName8");
        human.put("LastName9", "FistName9");
        human.put("LastName10", "FistName1");

        return human;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (HashMap.Entry<String, String> pair: map.entrySet()) {
            String value = pair.getValue();
            if(value == name){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if(key == lastName){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}


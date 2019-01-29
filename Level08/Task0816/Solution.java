/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level08.Task0816;

/*Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("LastName0", df.parse("JUNE 1 1980"));
        map.put("LastName1", df.parse("JULY 1 1980"));
        map.put("LastName2", df.parse("MARCH 1 1980"));
        map.put("LastName3", df.parse("JANUARY 1 1980"));
        map.put("LastName4", df.parse("FEBRUARY 1 1980"));
        map.put("LastName5", df.parse("MAY 1 1980"));
        map.put("LastName6", df.parse("JUNE 10 1980"));
        map.put("LastName7", df.parse("DECEMBER 1 1980"));
        map.put("LastName8", df.parse("OCTOBER 1 1980"));
        map.put("LastName9", df.parse("AUGUST 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry<String, Date> pair = iterator.next();
            if(pair.getValue().getMonth() == 5 || pair.getValue().getMonth() ==6 || pair.getValue().getMonth() == 7){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}

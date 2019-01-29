/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level05.Task0528;

/*Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".


Требования:
1. Дата должна содержать день, месяц и год, разделенные пробелом.
2. День должен соответствовать текущему.
3. Месяц должен соответствовать текущему.
4. Год должен соответствовать текущему.
5. Вся дата должна быть выведена в одной строке.
 */
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dateFormat.format( currentDate ) );
    }
}


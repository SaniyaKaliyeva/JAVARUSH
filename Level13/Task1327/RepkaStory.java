/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level13.Task1327;

/**
 *
 * @author macbookair
 */
import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size()-1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i-1);
            first.pull(second);
        }

    }
}
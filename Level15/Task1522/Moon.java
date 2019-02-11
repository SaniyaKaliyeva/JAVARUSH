/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15.Task1522;

/**
 *
 * @author macbookair
 */
public final class Moon implements Planet {
    private static Moon instance;
    private Moon() {};

    public static Moon getInstance(){
        if (instance == null){
            instance = new Moon();
        }
        return instance;
    }
}

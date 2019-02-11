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
public final class Earth implements Planet {
    private static Earth instance;
    private Earth() {};

    public static Earth getInstance(){
        if (instance == null){
            instance = new Earth();
        }
        return instance;
    }
}

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
public final class Sun implements Planet {
    private static Sun instance;
    private Sun(){} //private конструктор

    public static Sun getInstance(){
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }
}


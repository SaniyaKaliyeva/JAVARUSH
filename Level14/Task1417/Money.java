/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level14.Task1417;

/**
 *
 * @author macbookair
 */
public abstract class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public  double getAmount(){
        return this.amount;
    };

    public abstract String getCurrencyName();
}


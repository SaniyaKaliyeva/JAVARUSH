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
public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 50.0;
    }

    @Override
    public String getCurrencyName() { return "RUB";}
}

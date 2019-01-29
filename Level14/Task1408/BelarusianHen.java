/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level14.Task1408;

/**
 *
 * @author macbookair
 */
public class BelarusianHen extends Hen{
    public int getCountOfEggsPerMonth() { return 1; };

    String getDescription() { return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}
}

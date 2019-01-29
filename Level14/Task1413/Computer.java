/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level14.Task1413;

/**
 *
 * @author macbookair
 */
public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor){
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() { return this.keyboard;}

    public Mouse getMouse() { return this.mouse;}

    public Monitor getMonitor() { return this.monitor;}
}

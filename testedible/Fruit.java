/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedible;

/**
 *
 * @author Isaiah
 */
public abstract class Fruit {

    private String isGrownOn;
    
    //Create no-arg constructor
    public Fruit() {

    }
    
    //Create abstract method isGrownOn()
    public abstract String isGrownOn();

    //Create abstract method isGrownOn()
    public abstract String howGrown();

}

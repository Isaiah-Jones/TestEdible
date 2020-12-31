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
public class Cherry extends Fruit implements Edible {

    //Create no-arg constructor
    public Cherry() {

    }

    //Create a getter for what the Cherry is grown from
    public String getIsGrownOn() {
        return "Cherry: Is Grown on a Cherry tree";

    }

    //Override the howGrown method from the parent class
    @Override
    public String howGrown() {
        return "Cherry: Plant a seed in fertle soil and water regulary";
    }

    //Override the howToEat method from the parent class
    @Override
    public String howToEat() {
        return "Cherry: Pluck from stem and enjoy";
    }

    //Override the isGrownOn() method from the parent class
    @Override
    public String isGrownOn() {
        return getIsGrownOn();
    }

}

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
public class PricklyPear extends Fruit implements Edible {

    //Create no-arg constructor
    public PricklyPear() {

    }

    //Create a getter for what the Prickly Pear is grown from
    public String getIsGrownOn() {
        return "Prickly Pear: Is grown on a certain type of cactus.";

    }

    //Override the howGrown() method from the parent class
    @Override
    public String howGrown() {
        return "Prickly Pear: Grow in a garden pot with half soil, half sand, and keep in a warm but shady place."
                + " Water when soil gets dry to the touch.";
    }

    //Override the howToEat() method from the parent class
    @Override
    public String howToEat() {
        return "Prickly Pear: Cut from the cactus pad. Cut off both ends and then remove the skin. "
                + "But be very careful: Safety Gloves Advised."
                + " (Alternatively: Use the claw)";
    }
     //Override the isGrownOn() method from the parent class
    @Override
    public String isGrownOn() {
        return getIsGrownOn();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedible;

/**
 *
 * @author orucitilab
 */
public class Chicken extends Animal implements Edible {
    
    //Create no-arg constructor
    public Chicken() {
    }

    //Override the sound() method from the parent class
    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-do";
    }

    //Override the howToEat() method from the implemented Edible interface
    @Override
    public String howToEat() {
        return "Chicken: Bread it and fry it!";
    }

}

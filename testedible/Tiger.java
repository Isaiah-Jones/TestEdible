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
public class Tiger extends Animal {

    //Create no-arg constructor
    public Tiger() {
    }
    
    //Override the sound() method from the parent class
    @Override
    public String sound() {
        return "Tiger: RRRAAAAAAWR!!!";
    }

}

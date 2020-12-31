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
public class TestEdible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a new array of objects
        //Fill the array with the objects Chicken, Tiger, Cherry, and PricklyPear
        Object[] objects = {new Chicken(), new Tiger(), new Cherry(), new PricklyPear()};
        
        //Use a for loop to print out the information in the array
        for (int i = 0; i < objects.length; i++) {
            
            //Use if statements to organize the printed information
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }
            if (objects[i] instanceof Fruit) {
                System.out.println(((Fruit) objects[i]).howGrown());
                System.out.println(((Fruit) objects[i]).isGrownOn());
            }
        }

    }

}

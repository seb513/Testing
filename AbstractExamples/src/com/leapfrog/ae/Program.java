/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ae;

import com.leapfrog.ae.entity.Animal;
import com.leapfrog.ae.entity.AnimalList;
import com.leapfrog.ae.entity.Dog;
import com.leapfrog.ae.entity.Fish;

/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal[] thelist = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();
        
        thelist[0] = d;
        thelist[1] = f;
        
        for(Animal a: thelist){
            a.noise();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ae.entity;

/**
 *
 * @author User
 */
public class AnimalList {
    private final Animal[] animallist;
    private int i = 0;
    
    public AnimalList(){
        this.animallist = new Animal[4];
    }
    
    public void add(Animal a){
        if(i<animallist.length){
            animallist[i] = a;
            System.out.println("Animal added in index:" + i );
            i++;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Container {
    private int liquidAmount;
    
    public Container(){
        this.liquidAmount = 0;
    }
    
    public int contains(){
        return liquidAmount;
    }
    
    public void add(int amount){
        if(amount > 0){
            this.liquidAmount = liquidAmount + amount;
            if(liquidAmount > 100){
                liquidAmount = 100;
            }
        }
    }
    
    public void remove(int amount){
        if(amount > 0){
            this.liquidAmount = liquidAmount - amount;
            if(liquidAmount < 0){
                liquidAmount = 0;
            }
        }
    }
    
    public String toString(){
        return this.liquidAmount + "/100"; 
    }
    
}

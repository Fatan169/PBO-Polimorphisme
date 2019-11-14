/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lp1;

/**
 *
 * @author asus
 */
public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println(" AeroPlan is Playing  ");
    }
    public static void main(String[] args) {
        AeroPlan Boeng = new AeroPlan();
        Boeng.function();
        Boeng.fuel();
        Boeng.walk();
    }
    
}

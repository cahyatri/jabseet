/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author MPC
 */
public class UjiBus3 {
    public static void main(String[] abc){
        Bus3 Bus3 = new Bus3(5);
        Bus3.getpenumpang(17);
        Bus3.getpenumpang(24);
        Bus3.cetakpenumpang();
        Bus3.addpenumpang (2);
        Bus3.cetakpenumpang();
        Bus3.addpenumpang(1);
        Bus3.cetakpenumpang();
        Bus3.addpenumpang(2);
        Bus3.cetakpenumpang();
        Bus3.addpenumpang(2);
        Bus3.cetakpenumpang();
        
    }
}

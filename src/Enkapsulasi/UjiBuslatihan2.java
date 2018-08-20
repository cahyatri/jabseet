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
public class UjiBuslatihan2 {
    public static void main(String[]args){
        Buslatihan2 busBesar = new Buslatihan2(40);
        busBesar.cetak();
        busBesar.addpenumpang(5);
        busBesar.cetak();
        busBesar.addpenumpang(26);
        busBesar.cetak();
        
    }
}

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
public class Buslatihan2 {
     public int penumpang;
        public int maxPenumpang;
        
        public Buslatihan2(int maxPenumpang){
            this.maxPenumpang=maxPenumpang;
            penumpang = 0;
        }
        public void addpenumpang(int penumpang){
            int temp;
            temp = this.penumpang+penumpang;
            if(temp >= maxPenumpang){
                System.out.println("penumpang melebihi kouta");
            }else{
                this.penumpang = temp;
            }
        }
        public void cetak(){
            System.out.println("Penumpang Bus sekarang adalah " + penumpang);
            System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
        }
        
}

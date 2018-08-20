/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPratikum;

/**
 *
 * @author MPC
 */
public class BolaEnkapsulasi {
    public int Jarijari;
    public double phi = 3.14;
    
    public int getJarijari(){
     return Jarijari;   
    }
    public double getphi(){
        return phi;
    }
    public void setJarijari(int newJarijari){
        Jarijari = newJarijari;
    }
    public void setphi(double newphi){
        phi=newphi;
    }
    public void setshowDiameter(){
        int p;
        p = 2 * Jarijari ;
        System.out.print("Diameter : " + p);
    }
    public void setshowLuasPermukaan(){
       System.out.print(" Luas Permukaan Bola =  " + phi * Jarijari * Jarijari * 4);
    }
    public void setshowVolume(){
        System.out.print(" Luas Permukaan Bola =  " + phi * 4/3 * Jarijari * Jarijari * Jarijari);
    }
   
}

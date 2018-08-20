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
public class Bus4 {
     public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangBaru;
    public Bus4(double maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else{
            this.penumpang=temp;
        }
    }
    public void getpenumpang(int password){
        if(password==24){
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Pasword Salah");
        }
    }
    public void getAverage(double average){
         if(counter == 24){
            System.out.println(" ");
        }
        else{
            System.out.println(" ");
        }

    }
    public void cetakpenumpang(){
        System.out.println("penumpang Bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxpenumpang);
}
}

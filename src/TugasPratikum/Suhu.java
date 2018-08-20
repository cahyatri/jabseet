/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPratikum;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MPC
 */
public class Suhu {
    public static void main (String[] args){
        Scanner masukan = new Scanner(System.in);
        float R,F,K;
        System.out.print("Masukan nilai suhu dari celcius : ");
        float c = masukan.nextFloat();
        System.out.print("Pilih konversi k,r,f: ");
        String pilihan = masukan.next();
        switch(pilihan){
            case "K":
            case "k":
            System.out.println("Hasil : " +(K = c + 273));
            break;
            case "R":
            case "r":
            System.out.println("Hasil : " +(R = c*4/5));
            break;
            case "F":
            case "f":
            System.out.println("Hasil : " +(F = c *9/5+32));
            break;
        }
        
    }
}

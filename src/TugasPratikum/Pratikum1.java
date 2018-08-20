/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPratikum;

import java.util.Scanner;

/**
 *
 * @author MPC
 */
public class Pratikum1 {
    public static void main(String [] args) {
    Scanner masukan = new Scanner(System.in);
    float r,luas,phi = (float) 22/7;
    System.out.print("Masukan nilai jari2 : ");
    r = masukan.nextFloat();
        luas  = phi * 4 * r * r;
    System.out.println("Luas permukaan bola : " + luas); 
   }
}

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
public class biodata {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        String nama,nis,tmp,tgl,jns,almt,motto;
        System.out.println();
        System.out.print("Biodata");
        System.out.println();
        System.out.print(" Nama          : ");
        nama = masukan.nextLine();
        System.out.print(" NIS           : ");
        nis = masukan.nextLine();
        System.out.print(" Tempat Lahir  :  ");
        tmp = masukan.nextLine();
        System.out.print(" Tanggal Lahir : ");
        tgl = masukan.nextLine();
        System.out.print(" Jenis Kelamin : ");
        jns = masukan.nextLine();
        System.out.print(" Alamat di Malang : ");
        almt = masukan.nextLine();
        System.out.print(" Motto : ");
        motto = masukan.nextLine();
    }
}

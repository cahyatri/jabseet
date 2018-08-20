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
public class EncapSiswa {
    private String name;
    private String address;
    private int absen;
    private String Wasis;
    
    public int getAbsen(){
        return absen;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getWasis(){
        return Wasis;
    }
    public void setAbsen(int newAbsen){
        absen=newAbsen;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public void setWasis(String newWasis){
        Wasis = newWasis;
    }

   
}

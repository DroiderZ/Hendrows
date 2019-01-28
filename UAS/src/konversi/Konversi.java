/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package konversi;

/**
 *
 * @author Lenovo
 */
public class Konversi {
     public int Konversi(int n1) {
         int b = Integer.valueOf(n1);
         String hitung = Integer.toBinaryString(b);
         int bin = Integer.valueOf(hitung);
        return bin;
    }
    
    public String Konversi(String n1) {
        int angka = Integer.parseInt(n1);
        String hex = Integer.toHexString(angka);
        return hex;
    }
}

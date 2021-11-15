/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naufal Zaki
 *         TIFRP 19A
 *         19552011155
 *  Teknik Informatika
 ----------------------------------
 * SEKOLAH TINGGI TEKNOLOGI BANDUNG
 ----------------------------------
 */

import java.util.Scanner;

public class Utama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kode;
        int Milo=10000;
        int Kopi=3000;
        int Tehmanis=2500;
        int Jus=5000;
        
        int jumlah, bayar, total;
        float diskon;
        
        System.out.println("----------------><---------------");
        System.out.println("          Resto Drink KQ-5       ");
        System.out.println("----------------><---------------");
        System.out.println("           Aneka Minuman         ");
        System.out.println("");
        System.out.println(" 1. Milo      - Rp 10.000,-");
        System.out.println(" 2. Kopi      - Rp 3.000,-");
        System.out.println(" 3. Teh Manis - Rp 2.500,-");
        System.out.println(" 4. Jus       - Rp 5.000,-");
        System.out.println("----------------><---------------");
        System.out.println("\nMasukan kode minuman 1, 2, 3, 4");
        System.out.println("\nKode minuman :");
        kode=input.next();
        
        if(kode.equalsIgnoreCase("1")) {
            System.out.println("\nNama minuman :Milo");
            System.out.println("Harga :Rp.10000");
            System.out.println("Jumlah beli :");
            jumlah=input.nextInt();
            bayar=jumlah*Milo;
            System.out.println("\nTotal bayar :Rp."+bayar);
            
            if(bayar>=100000){
                diskon=(float)0.15*bayar;
                total=bayar-(int)diskon;
                System.out.println("\n\nMendapat diskon 15% :Rp."+diskon);
                System.out.println("Bayar :Rp."+total); 
            }else{
                 System.out.println("\nTidak mendapat diskon");
            }
        }
        if(kode.equalsIgnoreCase("2")) {
            System.out.println("\nNama minuman :Kopi");
            System.out.println("Harga :Rp.3000");
            System.out.println("Jumlah beli :");
            jumlah=input.nextInt();
            bayar=jumlah*Kopi;
            System.out.println("\nTotal bayar :Rp."+bayar);
            
            if(bayar>=100000){
                diskon=(float)0.15*bayar;
                total=bayar-(int)diskon;
                System.out.println("\n\nMendapat diskon 15% :Rp."+diskon);
                System.out.println("Bayar :Rp."+total); 
            }else{
                 System.out.println("\nTidak mendapat diskon");
            }
        }
        if(kode.equalsIgnoreCase("3")) {
            System.out.println("\nNama minuman :Teh Manis");
            System.out.println("Harga :Rp.2500");
            System.out.println("Jumlah beli :");
            jumlah=input.nextInt();
            bayar=jumlah*Tehmanis;
            System.out.println("\nTotal bayar :Rp."+bayar);
            
            if(bayar>=100000){
                diskon=(float)0.15*bayar;
                total=bayar-(int)diskon;
                System.out.println("\n\nMendapat diskon 15% :Rp."+diskon);
                System.out.println("Bayar :Rp."+total); 
            }else{
                System.out.println("\nTidak mendapat diskon");
            }
        }
        if(kode.equalsIgnoreCase("4")) {
            System.out.println("\nNama minuman :Jus");
            System.out.println("Harga :Rp.5000");
            System.out.println("Jumlah beli :");
            jumlah=input.nextInt();
            bayar=jumlah*Jus;
            System.out.println("\nTotal bayar :Rp."+bayar);
            
            if(bayar>=100000){
                diskon=(float)0.15*bayar;
                total=bayar-(int)diskon;
                System.out.println("\n\nMendapat diskon 15% :Rp."+diskon);
                System.out.println("Bayar :Rp."+total); 
            }else{
                 System.out.println("\nTidak mendapat diskon");
            }
        }
    
    }
}

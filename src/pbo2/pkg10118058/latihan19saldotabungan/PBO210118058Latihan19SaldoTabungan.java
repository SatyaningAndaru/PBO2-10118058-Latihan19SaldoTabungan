/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan19saldotabungan;

/**
 *
 * @author Satyaning andaru bawalaksana
 */
public class PBO210118058Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
    * Nama : Satyaning Andaru Bawalaksana
    * NIM : 10118058
    * Kelas : IF-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,total,bunga;
        total=2500000;
        bunga= (int) (total*0.15);
        total = total+bunga;
        i=1;
        do{
            System.out.println("Saldo dibulan ke- " +i + " Rp. " +total);
            i++;
            bunga =(int)(total * 0.15);
            total+=bunga;
        }while(i<=6);
        System.out.println("Developed By Satyaning Andaru");
    }
    
}

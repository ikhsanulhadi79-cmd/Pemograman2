/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latconsole;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class main {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.print("Masukkan NIM: ");
        mhs.setNim(input.nextLine());
        
        System.out.print("Masukkan Nama: ");
        mhs.setNama(input.nextLine());
        
        System.out.print("Masukkan Nilai UTS: ");
        mhs.setUts(input.nextFloat());
        
        System.out.print("Masukkan Nilai UAS: ");
        mhs.setUas(input.nextFloat());
        
        System.out.println("\n=== HASIL ===");
        System.out.println("NIM  : " + mhs.getNim());
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("Nilai Akhir : " + mhs.getNilaiAkhir());
        System.out.println("Grade : " + mhs.getGrade());
    }
}

    

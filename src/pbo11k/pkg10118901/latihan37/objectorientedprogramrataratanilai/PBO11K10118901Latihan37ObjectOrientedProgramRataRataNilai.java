/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan37.objectorientedprogramrataratanilai;
import java.util.*;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menghitung rata rata nilai dengan banyak mahasiswa di input oleh user dalam konsep orientasi objek
 */
public class PBO11K10118901Latihan37ObjectOrientedProgramRataRataNilai {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RataRataNilai rrn = new RataRataNilai();
        int n;
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        rrn.hitungRataRataNilai(n);
        
        
    }
    
}

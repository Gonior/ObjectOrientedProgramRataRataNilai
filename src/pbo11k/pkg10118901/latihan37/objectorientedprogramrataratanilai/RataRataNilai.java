/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan37.objectorientedprogramrataratanilai;
import java.util.Scanner;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menghitung rata rata nilai dengan banyak mahasiswa di input oleh user dalam konsep orientasi objek
 */
public class RataRataNilai {
    private static Scanner input = new Scanner(System.in);
    private int jumlahMahasiswa;
    private int nilaiSatuan;
    private int totalNilai;
    private double avNilai;
    private void masukanNilai(int varJumlahMahasiswa) {
        for(int i = 1; i<=varJumlahMahasiswa;i++) {
            System.out.print("Nilai Mahasiswa Ke-"+i+" ");
            nilaiSatuan = input.nextInt();
            totalNilai = totalNilai + nilaiSatuan;
        }
        avNilai = (double) totalNilai/varJumlahMahasiswa;
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah "+ avNilai);
        System.out.println("Developed by : Dedi Cahya");
    }
    
    public void hitungRataRataNilai(int varJumlahMahasiswa) {
        jumlahMahasiswa = varJumlahMahasiswa;
        masukanNilai(jumlahMahasiswa);
    }
    
}

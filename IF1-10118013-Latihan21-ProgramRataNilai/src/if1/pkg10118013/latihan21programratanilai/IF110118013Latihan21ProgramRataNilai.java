/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan21programratanilai;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menghitung Nilai Rata-Rata Mahasiswa
 */
public class IF110118013Latihan21ProgramRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiswa = scanner.nextInt();
        float rataRata = 0;
        for ( int i = 0; i < jumlahMahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            rataRata += scanner.nextInt();
        }
        rataRata /= jumlahMahasiswa;
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class AplikasiNilai {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nim = new String[100];
        String[] nama = new String[100];
        double[] uts = new double[100];
        double[] uas = new double[100];
        double[] nilaiAkhir = new double[100];
        char[] grade = new char[100];

        int jumlah = 0;
        int pilihan = 0;

        do {
            // VALIDASI PILIHAN MENU
            while (true) {
                try {
                    System.out.println("\n=== DATA MAHASISWA ===");
                    System.out.println("\n=== MENU ===");
                    System.out.println("1. Input Data");
                    System.out.println("2. Tampil Data");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih: ");
                    pilihan = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Input harus angka!");
                    input.nextLine(); // buang error input
                }
            }

            switch (pilihan) {
                case 1:
                    int n = 0;

                    // VALIDASI jumlah data
                    while (true) {
                        try {
                            System.out.print("Jumlah data: ");
                            n = input.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Harus angka!");
                            input.nextLine();
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nData ke-" + (jumlah + 1));

                        input.nextLine(); // bersihkan buffer

                        System.out.print("NIM: ");
                        nim[jumlah] = input.nextLine();

                        System.out.print("Nama: ");
                        nama[jumlah] = input.nextLine();

                        // VALIDASI UTS
                        while (true) {
                            try {
                                System.out.print("Nilai UTS: ");
                                uts[jumlah] = input.nextDouble();
                                break;
                            } catch (Exception e) {
                                System.out.println("Harus angka!");
                                input.nextLine();
                            }
                        }

                        // VALIDASI UAS
                        while (true) {
                            try {
                                System.out.print("Nilai UAS: ");
                                uas[jumlah] = input.nextDouble();
                                break;
                            } catch (Exception e) {
                                System.out.println("Harus angka!");
                                input.nextLine();
                            }
                        }

                        nilaiAkhir[jumlah] = (uts[jumlah] + uas[jumlah]) / 2;

                        if (nilaiAkhir[jumlah] >= 80)
                            grade[jumlah] = 'A';
                        else if (nilaiAkhir[jumlah] >= 70)
                            grade[jumlah] = 'B';
                        else if (nilaiAkhir[jumlah] >= 60)
                            grade[jumlah] = 'C';
                        else if (nilaiAkhir[jumlah] >= 50)
                            grade[jumlah] = 'D';
                        else
                            grade[jumlah] = 'E';

                        jumlah++;
                    }
                    break;

                case 2:
                    System.out.println("\n=== DATA MAHASISWA ===");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("NIM   : " + nim[i]);
                        System.out.println("Nama  : " + nama[i]);
                        System.out.println("UTS   : " + uts[i]);
                        System.out.println("UAS   : " + uas[i]);
                        System.out.println("Nilai Akhir : " + nilaiAkhir[i]);
                        System.out.println("Grade : " + grade[i]);
                        System.out.println("----------------------");
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);
    }
}
    


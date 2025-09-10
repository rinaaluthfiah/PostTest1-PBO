/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_konsultasi_psikolog;

/**
 *
 * @author ISRINA LUTHFIAH
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<String> namaPasien = new ArrayList<>();
        ArrayList<String> keluhan = new ArrayList<>();
        ArrayList<String> jadwal = new ArrayList<>();

        Scanner objekScanner = new Scanner(System.in);
        int pilihan=0;

        while(pilihan !=5) {
            System.out.println("\n ===SISTEM LAYANAN KONSULTASI PSIKOLOG===");
            System.out.println("1. Tambah Data Konsultasi");
            System.out.println("2. Tampilkan Data Konsultasi");
            System.out.println("3. Perbarui Data Konsultasi");
            System.out.println("4. Hapus Data Konsultasi");
            System.out.println("5. Keluar");
            System.out.print("Silahkan pilih menu diatas (1-5): ");
            pilihan = objekScanner.nextInt();
            objekScanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien: ");
                    String nama = objekScanner.nextLine();
                    
                    System.out.print("Masukkan keluhan: ");
                    String keluh = objekScanner.nextLine();
                    
                    System.out.print("Masukkan jadwal konsultasi: ");
                    String waktu = objekScanner.nextLine();
              
                    namaPasien.add(nama);
                    keluhan.add(keluh);
                    jadwal.add(waktu);
                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:
                    if (namaPasien.size() ==0) {
                        System.out.println("Belum ada data konsultasi.");
                    } else {
                        System.out.println("\n---Daftar Konsultasi ---");
                        for (int i = 0; i < namaPasien.size(); i++) {
                            System.out.println("----------------------------");
                            System.out.println("Data ke-" + (i + 1));
                            System.out.println("Nama   : " + namaPasien.get(i));
                            System.out.println("Keluhan: " + keluhan.get(i));
                            System.out.println("Jadwal : " + jadwal.get(i));
                        }
                        System.out.println("-----------------------------------");
                    }
                    break;        

                case 3:
                    if (namaPasien.size() ==0) {
                        System.out.println("Tidak ada data untuk diubah.");
                    } else {
                        System.out.print("Pilih nomor data yang akan diubah: ");
                        int ubah = objekScanner.nextInt();
                        objekScanner.nextLine();

                        if (ubah > 0 && ubah <= namaPasien.size()) {
                            System.out.print("Nama baru: ");
                            namaPasien.set(ubah - 1, objekScanner.nextLine());
                            System.out.print("Keluhan baru: ");
                            keluhan.set(ubah - 1, objekScanner.nextLine());
                            System.out.print("Jadwal baru: ");
                            jadwal.set(ubah - 1, objekScanner.nextLine());
                            System.out.println("Data berhasil diubah!");
                        } else {
                            System.out.println("Nomor tidak valid");
                        }
                    }
                    break;

                case 4:
                    if (namaPasien.size() == 0) {
                        System.out.println("Tidak ada data untuk dihapus");
                    } else {
                        System.out.print("Masukkan nomor data yang akan dihapus: ");
                        int hapus = objekScanner.nextInt();
                        objekScanner.nextLine();

                        if (hapus > 0 && hapus <= namaPasien.size()) {
                            namaPasien.remove(hapus - 1);
                            keluhan.remove(hapus - 1);
                            jadwal.remove(hapus - 1);
                            System.out.println("Data berhasil dihapus");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan Konsultasi Psikolog ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak ada, coba lagi!");
            }
        } 

        objekScanner.close();
        }
    }


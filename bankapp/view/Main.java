package com.mycompany.bankapp.view;

import com.mycompany.bankapp.service.BankService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService service = new BankService();
        service.buatDataAwal(); 

        while (true) {
            System.out.println("\n--- Program Bank Digital ---");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Tampilkan Nasabah");
            System.out.println("3. Ubah Nama Nasabah");
            System.out.println("4. Hapus Nasabah");
            System.out.println("5. Lakukan Transaksi");
            System.out.println("6. Lihat Mutasi Rekening");
            System.out.println("7. Cari Nasabah (Nama/No. Rek)");
            System.out.println("8. Bonus untuk Nasabah Prioritas");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu (1-9): ");

            String input = scanner.nextLine();
            int pilihan;

            try {
                pilihan = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, masukkan angka!");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Nasabah: ");
                    String nama = scanner.nextLine();
                    System.out.print("Setoran Awal: ");
                    double saldoAwal = Double.parseDouble(scanner.nextLine());
                    service.tambahNasabah(nama, saldoAwal);
                    break;

                case 2:
                    service.tampilkanSemuaNasabah();
                    break;

                case 3:
                    System.out.print("Masukkan No. Rekening: ");
                    String noRekUbah = scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String namaBaru = scanner.nextLine();
                    service.ubahNamaNasabah(noRekUbah, namaBaru);
                    break;

                case 4:
                    System.out.print("Masukkan No. Rekening: ");
                    String noRekHapus = scanner.nextLine();
                    service.hapusNasabah(noRekHapus);
                    break;

                case 5:
                    menuTransaksi(scanner, service);
                    break;

                case 6:
                    System.out.print("Masukkan No. Rekening: ");
                    String noRekMutasi = scanner.nextLine();
                    service.lihatMutasiRekening(noRekMutasi);
                    break;

                case 7:
                    System.out.print("Masukkan Nama atau No. Rekening: ");
                    String keyword = scanner.nextLine();
                    service.cariNasabah(keyword);
                    break;

                case 8:
                    service.beriBungaNasabahPrioritas();
                    break;

                case 9:
                    System.out.println("Terima kasih!");
                    return;

                default:
                    System.out.println("Pilihan harus antara 1 sampai 9.");
            }
        }
    }

    private static void menuTransaksi(Scanner scanner, BankService service) {
        while (true) {
            System.out.println("\n--- Menu Transaksi ---");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Transfer Dana");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Pilih menu (1-4): ");

            String input = scanner.nextLine();
            int pilihan;

            try {
                pilihan = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, masukkan angka!");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("No.Rek: ");
                    String noRekSetor = scanner.nextLine();
                    System.out.print("Jumlah: ");
                    double jumlahSetor = Double.parseDouble(scanner.nextLine());
                    service.setorTunai(noRekSetor, jumlahSetor);
                    break;

                case 2:
                    System.out.print("No.Rek: ");
                    String noRekTarik = scanner.nextLine();
                    System.out.print("Jumlah: ");
                    double jumlahTarik = Double.parseDouble(scanner.nextLine());
                    service.tarikTunai(noRekTarik, jumlahTarik);
                    break;

                case 3:
                    System.out.print("No.Rek Pengirim: ");
                    String noRekPengirim = scanner.nextLine();
                    System.out.print("No.Rek Penerima: ");
                    String noRekPenerima = scanner.nextLine();
                    System.out.print("Jumlah: ");
                    double jumlahTransfer = Double.parseDouble(scanner.nextLine());
                    service.transferDana(noRekPengirim, noRekPenerima, jumlahTransfer);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

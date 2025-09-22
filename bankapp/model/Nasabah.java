package com.mycompany.bankapp.model;

import java.util.ArrayList;

public class Nasabah {
    private String nomorRekening;
    private String nama;
    private double saldo;
    private ArrayList<String> mutasiRekening;

    public Nasabah(String nomorRekening, String nama, double saldo) {
        this.nomorRekening = nomorRekening;
        this.nama = nama;
        this.saldo = saldo;
        this.mutasiRekening = new ArrayList<>();
    }

    // Getter & Setter (Encapsulation)
    public String getNomorRekening() { return nomorRekening; }
    public void setNomorRekening(String nomorRekening) { this.nomorRekening = nomorRekening; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public ArrayList<String> getMutasiRekening() { return mutasiRekening; }

    // Method umum (akan dioverride di subclass)
    public void tampilkanInfo() {
        System.out.println("Rekening: " + nomorRekening + " | Nama: " + nama + " | Saldo: Rp" + saldo);
    }
}

package com.mycompany.bankapp.model;

public class NasabahBiasa extends Nasabah {
    public NasabahBiasa(String nomorRekening, String nama, double saldo) {
        super(nomorRekening, nama, saldo);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Nasabah Biasa]");
        super.tampilkanInfo();
    }
}

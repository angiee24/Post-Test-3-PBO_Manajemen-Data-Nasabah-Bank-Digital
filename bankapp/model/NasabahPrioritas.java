package com.mycompany.bankapp.model;

public class NasabahPrioritas extends Nasabah {
    public NasabahPrioritas(String nomorRekening, String nama, double saldo) {
        super(nomorRekening, nama, saldo);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Nasabah Prioritas]");
        super.tampilkanInfo();
    }
}

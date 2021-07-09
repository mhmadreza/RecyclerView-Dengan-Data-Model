package com.mr.rvxobjectclassmodel.model;

public class MobilModel {

    private String merk, nama, warna, bbm, harga;

    public MobilModel(String merk, String nama, String warna, String bbm, String harga) {
        this.merk = merk;
        this.nama = nama;
        this.warna = warna;
        this.bbm = bbm;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBbm() {
        return bbm;
    }

    public void setBbm(String bbm) {
        this.bbm = bbm;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}

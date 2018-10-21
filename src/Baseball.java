/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nama : Firman Ardhiansyah
 *         Kelas : IF-2 (PB02)
 *         NIM : 10117056
 * Deskripsi Program : program untuk menghitung energi kinetik dan nilainya
 */
public class Baseball {

    private double massa;
    private double kecepatan;
    private double kinetik1;
    private double kinetik2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik1(double massa, double kecepatan) {
        kinetik1 = 0.5 * massa * (kecepatan * kecepatan);
        return kinetik1;
    }

    public void hitungEnergiKinetik2(double massa) {
        this.kinetik2 = 0.5 * massa * 0;
    }

    public double usaha() {
        return kinetik1 - kinetik2;
    }

}

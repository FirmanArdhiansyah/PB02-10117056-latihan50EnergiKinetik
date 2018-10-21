/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Main {

    public static void main(String[] args) {
        Baseball bola = new Baseball();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("1 buah baseball dengan massa\t   = "
                + bola.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = "
                + bola.getKecepatan() + " m/s");

        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();

        System.out.println("A. Energi Kinetik\t\t     = "
                + bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola dari keadaan diam = " + bola.usaha());
    }

}

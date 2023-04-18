package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array1D {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi array 2D
        String[][] ips = new String[3][4];

        //karena arrray bertipe string, maka ada konversi tipe data ke int bagi  data sks, bobot, total, jumlah sks, ip
        //menampung hasil konversi pada variabel
        //3.5 --> double
        double sks, bobot, totalBobot, jumlahSkS, grandtotal = 0, ip;

        try {
            //input data nim dan nama
            System.out.print("NIM :");
            String nim = br.readLine();
            System.out.print("Nama : ");
            String nama = br.readLine();

            //input data MK (jumlah data MK > 1)
            for (int i = 0; i < ips.length; i++) {
                System.out.print("Nama Mk :");
                ips[i][0] = br.readLine();
                System.out.print("SKS : ");
                ips[i][1] = br.readLine();

                //konversi tipe data dari ips[i][1] (String) ke double
                sks = Double.parseDouble(ips[i][1]);
                System.out.print("Bobot : ");
                ips[1][2] = br.readLine();
                bobot = Double.parseDouble(ips[1][2]);

                //memasukkan perhitungan IPS
                totalBobot = sks * bobot;

                ///total bobot oer index
                //konversi dari numeric (int, double, dll) ke string --> String.valueOf
                ips[i][3] = String.valueOf(totalBobot);
                System.out.println("Total = " + ips[i][3]);

                //hitung grand total
                grandtotal = grandtotal + totalBobot;
            }

            System.out.println("Grand total (sks * bobot) = " + grandtotal);
            //hitung IP
            System.out.print("Jumlah sks yang diambil : ");
            jumlahSkS = Double.parseDouble(br.readLine());
            ip = grandtotal / jumlahSkS;
            System.out.println("IP semester ini adalah " + ip);


        } catch (Exception e) {
        }
    }
}

package Tugas6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array2DPenjualan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi array 2D
        String[][] data = new String[5][4];
        // inisialisasi array 2 dimensi untuk menyimpan informasi barang
        String[][] barang = {{"Sabun", "1", "3000"}, {"Indomie goreng", "2", "2500"},
                {"Le minerale", "2", "3000"}, {"Silverqueen", "1", "14000"},
                {"Sunsilk 400ml", "1", "20000"}};

        // tampilkan header tabel
        System.out.println("Nama Barang\t\tQty\tHarga\tTotal");

        // tampilkan isi tabel menggunakan perulangan
        int grandTotal = 0;
        for (int i = 0; i < barang.length; i++) {
            int qty = Integer.parseInt(barang[i][1]);
            int harga = Integer.parseInt(barang[i][2]);
            int total = qty * harga;
            grandTotal += total;
            System.out.println(barang[i][0] + "\t\t\t" + barang[i][1] + "\t"
                    + barang[i][2] + "\t" + total);
        }

        // tampilkan grand total
        System.out.println("Grand Total\t\t\t\t\t" + grandTotal);

        // minta user memasukkan uang yang dibayarkan
        System.out.print("Uang dibayarkan = 50.000");
        int uangDibayarkan;
        do {
            uangDibayarkan = Integer.parseInt(br.readLine());
            if (uangDibayarkan < grandTotal) {
                System.out.println("uang yang dibayarkan < grandtotal");
            }
        } while (uangDibayarkan < grandTotal);

        // hitung kembalian
        int kembalian = uangDibayarkan - grandTotal;

        //menampilkan hasilnya
        System.out.println("uang dibayarkan\t\t\t\t" + uangDibayarkan);
        System.out.println("kembali\t\t\t\t\t\t" + kembalian);
    }
}

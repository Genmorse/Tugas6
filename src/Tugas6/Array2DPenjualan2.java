package Tugas6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2DPenjualan2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] data = new String[5][4];
        int grandTotal = 0;
        int uangDibayarkan, kembali;

        // Mengisi data awal pada array
        data[0][0] = "Sabun";
        data[0][1] = "1";
        data[0][2] = "3000";
        data[0][3] = "3000";

        data[1][0] = "Indomie Goreng";
        data[1][1] = "2";
        data[1][2] = "2500";
        data[1][3] = "5000";

        data[2][0] = "Le Minerale";
        data[2][1] = "2";
        data[2][2] = "3000";
        data[2][3] = "6000";

        data[3][0] = "Silverqueen";
        data[3][1] = "1";
        data[3][2] = "14000";
        data[3][3] = "14000";

        data[4][0] = "Sunsilk 400ml";
        data[4][1] = "1";
        data[4][2] = "20000";
        data[4][3] = "20000";

        // Menampilkan data awal pada array
        System.out.println("Nama Barang\tQty\tHarga\tTotal");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t\t");
            }
            System.out.println();
            grandTotal += Integer.parseInt(data[i][3]);
        }
        System.out.println("Grand Total\t\t\t\t" + grandTotal);

        // Meminta input uang yang dibayarkan dari user
        System.out.print("Uang Dibayarkan: ");
        uangDibayarkan = Integer.parseInt(br.readLine());

        // Menghitung kembalian
        kembali = uangDibayarkan - grandTotal;

        // Menampilkan hasil transaksi
        System.out.println("Kembali : \t\t\t\t\t" + kembali);
    }
}

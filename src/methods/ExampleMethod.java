package methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleMethod {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //prosedur penulisan dengan void
        //fungsi penulisan dengan tipe data & ada return value

        try {
            System.out.print("Masukkan alas : ");
            double alas = Double.parseDouble(br.readLine());
            System.out.print("Masukkan tinggi : ");
            double tinggi = Double.parseDouble(br.readLine());

            //hitung luas segtiga (memanggil fungsi)
            luasSegitiga(alas,tinggi);

            //cetak luas dari fungsi
            System.out.println("Luas segitiga adalah " + luasSegitiga(alas,tinggi));

            System.out.println();

            //cetak dari prosedur
            cetakLuas();

        } catch (Exception e) {
            System.err.println("Data salah");
        }

    }

    //membuat fungsi/prosedur
    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5*alas*tinggi; }

    //membuat prosedur untuk menampilkan hasil output luas segitiga

    public static void cetakLuas() {
        //bisa memanggil fungsi, bisa menggunakan java.IO, bisa menggunakan array, dsb.
        System.out.println("Luas segitiga : " + luasSegitiga(5,5));
    }

    //mengelompokkan inputan user ke dalam prosedur
    public static void inputDataLuasSegitiga() throws IOException {
        //jika dengan inpuutan user, perlu ada BufferedReader dan IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan alas : ");
        double alas = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tinggi : ");
        double tinggi = Double.parseDouble(br.readLine());
        
    }
}

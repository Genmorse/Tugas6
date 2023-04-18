package LatihanIOPercabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //if - else
        //cek syarat pembuatan KTP
        int usia;
        System.out.print("Masukkan usia anda : ");
        usia = Integer.parseInt(br.readLine());
        if (usia >= 17) {
            System.out.println("sudah memenuhi syarat");
        } else {
            System.out.println("Belum memenuhi syarat");
        }

        //if-else-if
        //cek status kelulusan MK
        String nim;
        int nilaiUAS;
        System.out.println("Masukkan nim anda : ");
        nim = br.readLine();
        System.out.println("Masukkan nilai UAS anda : ");
        nilaiUAS = Integer.parseInt(br.readLine());

        //jika nilai 80, 70, 65 = lulus, di bawah 65 tidak lulus
        if (nim.equalsIgnoreCase("22410100054")
                && nilaiUAS == 80) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100054")
                && nilaiUAS == 70) {
            System.out.println("LULUS");
        }  else if (nim.equalsIgnoreCase("22410100054")
                && nilaiUAS == 65) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100054")
                && nilaiUAS < 65) {
            System.out.println("TIDAK LULUS");
        } else {
            System.out.println("Nilai tidak ditemukan");
        }
        //equals : memperhatikan detail besar-kecil hurufnya (case sensitive)
        //equalsIgnoreCase : non-sensitive

        //nested if : if bertingkat
        //cek menu yang dipilih (makanan'minuman)
        //makanan = snack, nasi bungkus
        //minuman = kopi, teh, air mineral

        String menu, jenis;
        System.out.println("Masukkan menu (makanan/minuman) : ");
        menu = br.readLine();
        System.out.println("Masukkan jenis menu \n Makanan:Snack, Nasi bugnkus \n" +
                        "Minuman: kopi, teh,air mineral. " + "Pilih : ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("makanan")) {
            if (jenis.equalsIgnoreCase("snack")) {
                System.out.println("harga 2000");
            } else {
                System.out.println("harga 5000");
            }
        } else if (menu.equalsIgnoreCase("minuman")) {
            if (jenis.equalsIgnoreCase("kopi")) {
                System.out.println("harga 3000");
            }else if (jenis.equalsIgnoreCase("teh")) {
                System.out.println("harga 4000");
            }else if (jenis.equalsIgnoreCase("air mineral")){
                System.out.println("harga 2000");
            }

        }



        //nested if
        //cek menu yang dipilih (makanan/minuman)
    }
}

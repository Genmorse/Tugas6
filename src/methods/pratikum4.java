package methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pratikum4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] nilai = new int[2][3];
        String[] nama = new String[2];
        int Jumlahdata;
        System.out.print("Masukkan data yang akan dimasukkan : ");
        Jumlahdata = Integer.parseInt(br.readLine());

        for (int i = 0; i < Jumlahdata; i++) {
            System.out.println("Masukkan data ke " + (i + 1));
            System.out.print("Nama: ");
            nama[i] = br.readLine();
            System.out.print("Nilai Tugas : ");
            nilai[i][0] = Integer.parseInt(br.readLine());
            System.out.print("Nilai UTS : ");
            nilai[i][1] = Integer.parseInt(br.readLine());
            System.out.print("Nilai UAS : ");
            nilai[i][2] = Integer.parseInt(br.readLine());
            System.out.println("----------------------------------------");
        }

        System.out.print("Pencarian berdasarkan nama = ");
        String pencarian = br.readLine();
        int index = -1;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(pencarian)) {
                index = i;
            }

            if (index == -1) {
                System.out.println("Maaf Data tidak ditemukan");
            } else {
                System.out.println("Data ke " + (index + 1));
                System.out.println("Nama : " + nama[index]);
                System.out.println("Nilai tugas : " + nilai[index][0]);
                System.out.println("Nilai UTS : " + nilai[index][1]);
                System.out.println("Nilai UAS : " + nilai[index][2]);
                System.out.println("-----------------------------------");
                double nilaiAkhir = (nilai[index][0] * 0.3) + (nilai[index][1] * 0.3) + (nilai[index][2] * 0.4);
                System.out.println("Nilai Akhir : " + Math.round(nilaiAkhir));
            }
        }
    }
}

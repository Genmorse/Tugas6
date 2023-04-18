package Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPSProgram {
    public static void main(String[] args) {
        double totalNilai = 0;
        int totalSKS = 0;
        int maxSKS;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Masukkan Jumlah Mata Kuliah :");
            int n = Integer.parseInt(reader.readLine());

            for (int i = 1;i<=n;i++) {
                System.out.println("Mata Kuliah ke-"+i);
                System.out.println("Masukkan Nilai: ");
                double nilai = Double.parseDouble(reader.readLine());
                System.out.println("Masukkan Jumlah SKS: ");
                int sks = Integer.parseInt(reader.readLine());

                totalNilai += nilai * sks;
                totalSKS += sks;
            }
            double ips = totalNilai / totalSKS;
            System.out.println("IPS Anda pada semester 1 adalah "+ips);

            if (ips >= 3.5) {
                maxSKS = 24;
            }else if (ips>= 3.0) {
                maxSKS = 21;
            }else if (ips >= 2.5) {
                maxSKS = 18;
            }else if (ips >= 2.0) {
                maxSKS = 15;
            }else {
                maxSKS = 12;
                }
            System.out.println("SKS maksimal yang dapat dicapai adalah "+ maxSKS);
            } catch (IOException e)   {
            e.printStackTrace();
    }

    }
}

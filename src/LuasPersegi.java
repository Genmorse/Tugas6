public class LuasPersegi {
    public static void main(String[] args) {
        /*
        Rumus Luas Persegi:
        Panjang x Lebar

        Tahapan:
        1. Deklarasikan variabel
        2. Implementasikan rumus pada sebuah variabel
        3. Cetak variabel
         */

        //tahap 1
        double panjang = 5.0;
        double lebar = 3.8;

        //tahap 2
        double luas = panjang * lebar;

        //tahap 3
        System.out.println("Luas Persegi adalah "+luas);

        //Rumus Lingkaran = 1/2 x 3,14 x r2
        double PI = 3.14;
        double jari = 18;
        System.out.println(Math.PI * Math.pow(jari,2));
    }
}

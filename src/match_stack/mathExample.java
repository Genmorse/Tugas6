package match_stack;

import java.io.*;
import java.util.Stack;
//import java.util*;

public class mathExample {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //class math : int, float, double, bukan String
        //sqrt: akar kuadrat
        System.out.println(Math.sqrt(4.0));

        //pow: pangkat
        System.out.println(Math.pow(5.0,3));

        //random
        System.out.println(Math.random());

        /*
           item jurusan:
           1. SI
           2. DKv
           3. Manajemen

           Stack: urutan LIFO (Last in first out)
           Ketentuan:
           - import java util (ok)
           - deklarasi stack
           - push data (tambah data)
           - pop (ambil data/item)
           - size (lihat jumlah urutan stack)
         */

        Stack<String> stack = new Stack<>();
        System.out.println("Nama prodi 1 : " + stack.push("SI"));
        System.out.println("Nama prodi 1 : " + stack.push("DKV"));
        System.out.println("Nama prodi 1 : " + stack.push("Manajemen"));

        //lihat isi stack
        //! = notasi tidak sama dengan
        while (!stack.empty()){
            System.out.println("Cetak nama urutan : " + stack.pop());
            System.out.println("Jumlah urutan sekarang : " + stack.size());


            //mencari 2 contoh penerapan queue class
            //dicoba dengan intelij, diupload ke github, unggah link file github ke mybrilian

        }

    }
}

package Tugas7;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        {
            Queue<String> queue = new LinkedList<>();

            // Menambahkan permen ke dalam Queue
            queue.add("Permen 1");
            queue.add("Permen 2");
            queue.add("Permen 3");

            System.out.println("Isi awal Queue: " + queue);

            // Menghilangkan permen dari Queue menggunakan metode poll()
            String removedElement = queue.poll();
            System.out.println("Permen yang dihilangkan: " + removedElement);
            System.out.println("Isi Queue setelah penghilangan: " + queue);

            // Mengakses permen pertama Queue menggunakan metode peek()
            String firstElement = queue.peek();
            System.out.println("Permen pertama Queue: " + firstElement);
            System.out.println("Isi Queue setelah peek: " + queue);
        }
    }
    }


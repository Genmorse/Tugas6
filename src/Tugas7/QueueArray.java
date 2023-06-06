package Tugas7;

public class QueueArray {
    private static final int MAX_SIZE = 5;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public QueueArray() {
        queueArray = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isFull() {
        return currentSize == MAX_SIZE;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue kosong. Tidak bisa enqueue permen.");
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        queueArray[rear] = data;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong. Tidak dequeue permen.");
            return -1;
        }
        int dequeuedElement = queueArray[front];
        front = (front + 1) % MAX_SIZE;
        currentSize--;
        return dequeuedElement;
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Isi awal Queue: ");
        queue.displayQueue();

        queue.enqueue(6); // Akan mencetak "Queue kosong. Tidak bisa enqueue permen."

        int removedElement = queue.dequeue();
        System.out.println("Permen yang dihilangkan: " + removedElement);

        System.out.println("Isi Queue setelah penghilangan: ");
        queue.displayQueue();
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
            return;
        }
        int current = front;
        while (current != rear) {
            System.out.print(queueArray[current] + " ");
            current = (current + 1) % MAX_SIZE;
        }
        System.out.println(queueArray[current]);
    }
}


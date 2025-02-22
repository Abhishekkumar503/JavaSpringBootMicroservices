package Queue;

public class Runner {
    public static void main(String[] args) {
        Queue queue=new Queue();
        for (int i = 0; i < 60; i++) {
            queue.enque(i);
        }
        queue.Dequeue();

        queue.show();

    }
}

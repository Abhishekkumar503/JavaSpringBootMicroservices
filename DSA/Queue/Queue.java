package Queue;

public class Queue {
    int[] queue=new int[60];
    int front ;
    int size,rear;
    void enque(int data)
    {
        if(isFull())
            System.out.println("you Queue is full");
        else {
            queue[(rear++)%5] = data;
            size++;
        }
    }

    public void Dequeue()
    {
        int datd=queue[((front)%5)];
        size--;

    }

    void show()
    {
        for (int i=0;i<size; i++)
        {
            System.out.print(queue[(front+i)%5]+" "); // means starts with front value
        }
        System.out.println();
        for (int n:queue)
             System.out.print(n+" ");
    }

     public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {

        return (getSize()==0);
    }

    public boolean  isFull()
    {
        return getSize()==60;
    }


}

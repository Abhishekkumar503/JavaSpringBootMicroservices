package LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        for(int i=101;i<=121;i++)
            list.insert(i);

        list.insertAtStart(100);

        list.insertAtAnyIndex(2,102);
        list.insertAtAnyIndex(0,99);
        list.show();
        list.deleteAt(2);
        list.show();
    }
}

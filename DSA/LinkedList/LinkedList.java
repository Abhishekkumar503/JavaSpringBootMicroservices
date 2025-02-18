package LinkedList;

public class LinkedList {

    Node head;

    public void insert(int data) {
        Node node =new Node();
        node.data = data;
        node.next=null;
        if(head==null)
            head=node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data)
    {
        Node node =new Node();
        node.data = data;
        // node.next=null;
        node.next=head;
        head=node;
    }

    public void insertAtAnyIndex(int index,int data)
    {
        if(index==0)
            insertAtStart(data);
        else {
            Node node = new Node();
            node.data = data;
            node.next = null;
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void show()
    {
        Node temp = head;
        while(temp.next != null) // traverse all node
        {
            System.out.println(temp.data);
            temp = temp.next; // iterate all node
        }
        System.out.println(temp.data);


    }
    public void deleteAt(int index)
    {
        if (index==0)
        {
            head = head.next; // if deleting starting node
        }
        else
        {
            //declare node at starting
            Node n = head;
            Node n1 = null;
            for(int i=0; i<index; i++)
            {
                n = n.next;  // traverse till index
            }
            n1 = n.next;  // copy the previous address to indexed node i,e Copy node
            n.next=n1.next;  // copy address from indexed node to previous node

        }

    }

}

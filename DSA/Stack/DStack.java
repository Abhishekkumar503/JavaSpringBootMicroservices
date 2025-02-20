package Stack;

public class DStack {
    int capacity = 2;
    int[] stack=new int[capacity];
    int top = 0;
    public void push(int i) {
        if(size()==capacity)
            expand();

            stack[top++]=i;

    }
    private void expand()
    {
        int length=size();
        int[] newStack= new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
        capacity*=2;
    }

    public int pop() {
        int data=0;
        if(isEmpty())
            System.out.println("Stack is empty");
        else {
            data = stack[--top];
            stack[top] = 0;
            shirnk();
        }
        return data;
    }

    private void shirnk() {
        int length=size();
        if(length<=(capacity/2)/2)
            capacity/=2;

        int[] newStack= new int[capacity];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;

    }

    public int peek() {
        int data =stack[--top];
        return data;
    }
    public int size() {
        return top;
    }
    public boolean isEmpty() {
        return top<=0;
    }

    public void show() {
        for (int n:stack)
            System.out.print(n+" ");
        System.out.println();
    }

}

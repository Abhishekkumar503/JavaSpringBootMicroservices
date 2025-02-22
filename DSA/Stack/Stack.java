package Stack;

public class Stack {
        int[] stack=new int[5];
        int top=0;
        public void push(int i) {
            if(top==5)
            {
                System.out.println("Stack is Full");
            }
            else
                stack[top++]=i;
        }

    public int pop() {
        int data =stack[--top];
        stack[top]=0;
        return data;
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

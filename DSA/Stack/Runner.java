package Stack;

public class Runner {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(32);
        st.push(2);
        st.push(03);
        st.push(02);
        st.push(2);
        st.push(30);
        st.show();
        System.out.println();
        System.out.println(st.pop());
        st.show();
        System.out.println();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println("*********************** Dyanamic Stack **************");
        DStack dSt=new DStack();
        dSt.push(32);
        dSt.push(2);
        dSt.push(03);
        dSt.push(02);
        dSt.push(2);
        dSt.push(30);
        dSt.show();
        for (int i = 101; i <= 199; i++)
            dSt.push(i);
        dSt.show();

    }
}

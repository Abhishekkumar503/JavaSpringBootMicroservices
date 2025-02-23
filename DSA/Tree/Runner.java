package Tree;

public class Runner {
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree();
        bt.insert(20);
        bt.insert(12);
        bt.insert(2);
        bt.insert(1);
        bt.insert(102);
        bt.insert(120);
        bt.insert(132);

        bt.inorder();

        bt.preOrder();

        bt.postOrder();
    }
}

/*
OUTPUT

"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\lib\idea_rt.jar=55953:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Abh!shek\Documents\JSM2O\out\production\JSM Tree.Runner
1 2 12 20 102 120 132
20 1 2 12 102 120 132
1 2 12 102 120 132 20

Process finished with exit code 0

 */
public class sort {
    public static void main(String[] args) {
        int[] num={6,5,2,8,9,4};
        int[] num1={6,5,2,8,9,4};
        int[] num2={6,5,2,8,9,4};
        int count=0;
        int minindex=-1;
        int temp=0;
        System.out.print("Before sorting : ");
        for(int n:num)
            System.out.print(n+" ");
        System.out.println();
            for(int i=0;i<num.length;i++)
            {count++;
                for(int j=0;j<num.length-1-i;j++)
                {
                    if (num[j]>num[j+1])
                    {
                        temp=num[j];
                        num[j]=num[j+1];
                        num[j+1]=temp;
                    }

                }
                for(int n:num)
                    System.out.print(n+" ");
                System.out.println();
            }
        System.out.println("TimeComplexity : "+count);
        System.out.print("After sorting : ");
            for(int n:num)
                System.out.print(n+" ");

        //*********************************************** SELECTION SORT ************
        count=0;
        System.out.println();
        System.out.print("Before sorting : ");
        for(int n:num1)
            System.out.print(n+" ");
        System.out.println();
        for(int i=0;i<num1.length-1;i++)
        {count++;
            minindex=i;
            for(int j=i+1;j<num1.length;j++)
            {
                if(num1[minindex]>num1[j])
                {
                    minindex=j;
                }
            }
            temp=num1[minindex];
            num1[minindex]=num1[i];
            num1[i]=temp;
            for(int n:num1)
                System.out.print(n+" ");
            System.out.println();
        }
        System.out.println("TimeComplexity : "+count);
        System.out.print("After sorting : ");
        for(int n:num1)
            System.out.print(n+" ");
        System.out.println();

        //***************************************************** INSERTION SORT *****
        count=0;
        int i=0;
        int j=0;
        int key=0;
        System.out.print("Before sorting : ");
        for(int n:num2)
            System.out.print(n+" ");
        System.out.println();
        for (i=1;i<num2.length;i++)
        {count++;
            key=num2[i];
            j=i-1;
            while(j>=0 && num2[j]>key)
            {
                num2[j+1]=num2[j];
                j--;
            }
            num2[j+1]=key;
            for(int n:num2)
                System.out.print(n+" ");
            System.out.println();
        }
        System.out.println("TimeComplexity : "+count);
        System.out.print("After sorting : ");
        for(int n:num2)
            System.out.print(n+" ");



        //***************QUICK SHORT ****************************
        

    }
}

public class merge_1 {
    public static void divide(int[] arra,int si,int ei)
    {
        if(si >= ei)
            return;

        int mid =si+(ei-si)/2;
        divide(arra, si, mid);
        divide(arra, mid+1, ei);
        conquer(arra,si,mid,ei);

    }
    public static void conquer(int[] arr,int startingIndex,int midValue,int endingIndex)
    {
        int[] mergeTheDivideValue=new int[endingIndex-startingIndex+1];
        int indexOfFirstArray=startingIndex;
        int indexOfSecondarray=midValue+1;
        int pointer=0;
        while (indexOfFirstArray <= midValue && indexOfSecondarray <= endingIndex) // need to fix
        {
            if (arr[indexOfFirstArray] <= arr[indexOfSecondarray])
                mergeTheDivideValue[pointer++]=arr[indexOfFirstArray++];
            else
                mergeTheDivideValue[pointer++]=arr[indexOfSecondarray++];
        }
        while(indexOfFirstArray <= midValue)
            mergeTheDivideValue[pointer++]=arr[indexOfFirstArray++];

        while(indexOfSecondarray <= endingIndex)
            mergeTheDivideValue[pointer++]=arr[indexOfSecondarray++];

        for(int i=0,j=startingIndex;i<=mergeTheDivideValue.length-1;i++,j++)
            arr[j]=mergeTheDivideValue[i];
    }
    public static void main(String[] args) {
        int[] arr= {3,5,7,1,9,8};
        int lenthOfArr=arr.length-1;
        divide(arr,0,lenthOfArr);

        for (int num:arr)
            System.out.print(" "+num);
    }
}

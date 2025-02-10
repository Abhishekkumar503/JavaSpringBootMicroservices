package com.abis.learner;

public class AsserArrayEqualsExe {
     int[] testArrayAssertionByForloop(int limit)
    {
        int[] arrayNum = new int[limit];
        for (int i=0;i<limit;i++)
        {
            arrayNum[i]=i;
        }
        return arrayNum;
    }
    int[] testArrayAssertionByWhileloop(int limit) {
         int[] whileLoopArray=new int[limit];
        int j = 0;
        while (j < limit) {
            whileLoopArray[j] = j;
            j++;
        }
        return whileLoopArray;
    }
}

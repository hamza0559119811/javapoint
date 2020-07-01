package com.javapoint;

public class TestArray1 {
    public static void main(String[] args) {
        int a[] = {55,9,5,5,34,6,87};
        for (int i=0; i<a.length; i++)
        System.out.println(a[i]);

        TestArray2 a9 = new TestArray2();
        a9.arp();
        TestArray3 mini = new TestArray3();
        //passing array to method
        TestArray3.min(a9.arr1);
        //anonymous array
        TestArray3.min(new int[] {4,5,6,3,7,3,67,5,4,1});

        //multidimensional jagged array
        TestJaggedArray jgr = new TestJaggedArray();
        jgr.TestJaggedArray();


    } 
}

class TestArray2{
    int arr1[]={2,3,4,5,6,7,5,4};
    void arp(){
    for(int i:arr1)
    System.out.println(i);
    }
}


class TestArray3{


    static void min(int arr[])
    {
        int min = arr[0];
        for (int i=1; i<arr.length;i++)
        if(min>arr[i])
            min=arr[i];

    System.out.println(min+" minimum");

    }
}

// multidimensional array , jagged array

class TestJaggedArray{
    void TestJaggedArray(){
        int jarr[][] = new int[3][];
        jarr[0] = new int[3];
        jarr[1] = new int[4];
        jarr[2] = new int[6];

        int count = 0;
        for (int i=0 ; i<jarr.length ; i++)
            for(int j = 0; j<jarr[i].length ; j++)
                jarr[i][j] = count++;
        for (int i=0; i<jarr.length; i++){
            for(int j = 0; j<jarr[i].length; j++){
                System.out.print(jarr[i][j]+" ");
            }
            System.out.println();
        }


                
    }
}















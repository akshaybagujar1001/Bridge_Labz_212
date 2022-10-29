//Java Program to left rotate the elements of an array
//1 2 3 4 5  if rotate left 1 then op is 2 3 4 5 1 / 2 rotate -
package com.bzday6logicalProgramming.java.arrayproblem;

public class _03_RotateElementOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = 2;
        System.out.println("Original array :" + arr);

        System.out.println(" Print n left side");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
        for (int i = 0; i < n; i++)
//            int First = arr[0];
            for (int j = 0; j < arr.length; j++)
                arr[j] = arr[j + 1];
//            arr[j] = First;



    }
}

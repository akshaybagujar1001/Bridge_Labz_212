package com.bzday6logicalProgramming.java.arrayproblem;

public class MaxFromArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,76};
       int max= arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];

           }

           System.out.println(arr[i]);
       }

    }
}

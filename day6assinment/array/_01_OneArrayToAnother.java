package bzday6logicalProgramming.arrayproblem;

import java.util.Scanner;

public class _01_OneArrayToAnother {
    public static void main(String[] args) {
        int a[]= new int[5];
        int b[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value in First array");

        for(int i =0;i<5;i++){
            a[i]=sc.nextInt();

        }

        System.out.println("Value in First array ");

        for(int i =0;i<5;i++){
            System.out.println(a[i] + " ");
        }
        System.out.println("\nvalue in secong array");
        for(int i =0;i<5;i++){
            b[i]=a[i];
            System.out.println(b[i] + "");
        }

    }
}

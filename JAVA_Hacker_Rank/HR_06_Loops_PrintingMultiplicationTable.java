package JAVA_Hacker_Rank;

import java.util.Scanner;

public class HR_06_Loops_PrintingMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();

        for (int i=1;i<=10;i++)
            System.out.println(n+" X "+i+" = "+n*i);
    }
}

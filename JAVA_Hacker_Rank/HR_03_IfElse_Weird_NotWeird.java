package JAVA_Hacker_Rank;

import java.util.Scanner;

/*
Task
Given an integer, n , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format
A single line containing a positive integer, n .
Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0
3
Sample Output 0
Weird

Sample Input 1
24
Sample Output 1
Not Weird
 */
public class HR_03_IfElse_Weird_NotWeird {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (a%2==0 && a>=2 && a<=5)
            System.out.println("Not Weird");
        else if (a%2==0 && a>=6 && a<=20)
            System.out.println("Weird");
        else if (a%2==0 && a>20)
            System.out.println("Not Weird");
        else
            System.out.println("Weird");
    }
}

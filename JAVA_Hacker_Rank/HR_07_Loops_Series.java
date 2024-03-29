package JAVA_Hacker_Rank;

import java.util.Scanner;

/*
(a+2^0.b)+(a+2^0.b+2^1.b)+(a+2^0.b+2^1.b+2^2.b)+......+(a+2^0.b+2^1.b+....+2^n-1.b)

Input Format

The first line contains an integer, q, denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective ai, bi , and ni values for that query.

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */
public class HR_07_Loops_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double result=a;
            for (int j=0;j<n;j++)
            {
                result+=(Math.pow(2,j)*b);
                int x=(int)result;
                System.out.print(x+" ");
            }
            System.out.println();
        }
        in.close();
    }
}

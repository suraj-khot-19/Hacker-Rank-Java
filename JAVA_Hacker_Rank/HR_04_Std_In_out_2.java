package JAVA_Hacker_Rank;

import java.util.Scanner;
/*
Input Format:
The first line contains an integer.
The second line contains a double.
The third line contains a String.

Output Format:
On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.

**Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

Sample Input:
42
3.1415
Welcome to HackerRank's Java tutorials!
Sample Output:
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
 */

/*
Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens;
because of this, the last newline character for that line of integer input is still queued in the input buffer and the next
nextLine() will be reading the remainder of the integer line (which is empty).
 */
public class HR_04_Std_In_out_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=sc.nextDouble();
        /*
        to read string after other types variable we must use not=sc.next(); only=>> sc.nextLine(); once
         */
        sc.nextLine();
        String c=sc.nextLine();

        System.out.println("String: "+c);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);
    }
}

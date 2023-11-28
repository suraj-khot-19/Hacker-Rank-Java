package JAVA_Hacker_Rank;

import java.util.Scanner;

/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

Input Format:
There are two lines of input. The first line contains B: the breadth of the parallelogram.
                              The next line contains H: the height of the parallelogram.

Output Format:
If both values are greater than zero, then the main method must output the area of the parallelogram.
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1
1
3
Sample output 1
3

Sample input 2
-1
2
Sample output 2
java.lang.Exception: Breadth and height must be positive
 */
public class HR_09_StaticBlock {
//static variables
static int B,H;
static boolean flag=true;
//static block
    static {
        try{
            Scanner sc=new Scanner(System.in);
            B=sc.nextInt();
            H=sc.nextInt();
            if(B<=0 || H<=0)
            {
                flag=false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }

    }
    public static void main(String[] args){
    if(flag){
        int area=B*H;
        System.out.print(area);
    }

}//end of main

}//end of class
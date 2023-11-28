package JAVA_Hacker_Rank;
/*
Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits,
you must pad your output's leading digits with zeroes.

Sample Input:
java 100
cpp 65
python 50

Sample Output:
================================
java           100
cpp            065
python         050
================================
 */
import java.util.Scanner;

public class HR_05_OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d",s1,x);
            /*
            1) %-15s: - means: left-justified. 15 means: if the result is less than 15 characters long,
            add spaces until it is 15 characters long.
            2) %03d syntax is used to pad the integer with leading zeros to a fixed width of 2 digits.
             */
        }
        System.out.println("================================");

    }
}

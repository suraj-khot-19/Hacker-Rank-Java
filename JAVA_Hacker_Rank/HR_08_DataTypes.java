package JAVA_Hacker_Rank;
/*
Data Type	Size	    Description
byte	    1 byte  	Stores whole numbers from -128 to 127
short	    2 bytes    	Stores whole numbers from -32,768 to 32,767
int	        4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	    1 bit	    Stores true or false values
char	    2 bytes 	Stores a single character/letter or ASCII values
 */


/*
Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
 */
import java.util.Scanner;

public class HR_08_DataTypes {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();

            for(int i=0;i<t;i++)
            {
                try
                {
                    long x=sc.nextLong();
                    System.out.println(x+" can be fitted in:");
                    if(x>=-128 && x<=127)System.out.println("* byte");
                    if(x>=-32768 && x<=32767)System.out.println("* short");
                    if(x>=-2147483648 && x<= 2147483647)System.out.println("* int");
                    if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");

                }
                catch(Exception e)
                {
                    System.out.println(sc.next()+" can't be fitted anywhere.");
                }

            }
        }
    }


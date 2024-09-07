package patternpack1;

import java.util.Scanner;

public class pat4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 int no=sc.nextInt();
		 for(int i=1;i<=no;i++) //for row
			 {
			 for(int j=1;j<=i;j++)//for star
				{
				System.out.print(j);
			 }
			 System.out.println();
			 }

}
}

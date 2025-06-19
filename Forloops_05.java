import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int prev=0;
		int current=1;
		if(num==0 || num==1) {
			System.out.println(1);
		}else {
			int temp=0;
			for(int i=1;i<num;i++) {
				temp=prev;
				prev=current;
				current+=temp;
			}
			System.out.println(current);

		}
		sc.close();
	}

}

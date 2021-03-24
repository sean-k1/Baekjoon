package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Bak_1463_2 {
	static int N;
	static int min=Integer.MAX_VALUE;
	static int[]dp;
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		N=sc.nextInt();
		dp=new int[N+1];
		dp[1]=0;
		for(int i=2;i<=N;i++) {
			dp[i]=dp[i-1]+1;
			
			if(i%3==0) {
				dp[i]=Math.min(dp[i],dp[i/3]+1);
			}
			
			if(i%2==0) {
				dp[i]=Math.min(dp[i],dp[i/2]+1);
			}

			
			
			
		}
		//System.out.println(Arrays.toString(dp[N]));
		
	}
}

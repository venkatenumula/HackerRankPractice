package com.searching.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Coins2 {
	static class Scanner{
		BufferedReader br;
		StringTokenizer st;
		public Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			if(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	static boolean solve(int x,int[] a,int pSum[]) {
		int l=1, r =a.length-1;
		int b1=0,b2=0;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid]<x) {
				b1 = mid;
				l = mid+1;
			}
			else r = mid-1;
		}
		l = 0; r = a.length-1;
		while(l<=r) {
			int mid = (l+r)/2;
			if(a[mid]>x) {
				r = mid -1;
				b2 = mid;
			}
			else  l = mid+1;
		}
		return a[b1] <x && a[b2]>x && pSum[b1] == pSum[a.length-1]-pSum[b2-1];	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner();
		int n= scanner.nextInt();
		int[] a= new int[n+1];
		int[] cnt = new int[100001];
		int[] pSum = new int[n+1];
		int max = 0;
		for(int i=1;i<=n;i++) {
			a[i] = scanner.nextInt();
			max = Math.max(max, a[i]);
		}
		Arrays.sort(a);
		for(int i=1;i<=n;i++) {
			
			cnt[a[i]]++;
			pSum[i] = pSum[i-1]+a[i];
		}
		for(int i=1;i<=max;i++) {
		
			if(solve(i,a,pSum)) {
				System.out.println("YES");
				return ;
			}
			
		}
		System.out.println("NO");
	}
}
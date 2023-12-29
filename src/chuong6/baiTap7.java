package chuong6;

import java.util.Scanner;

//Dãy Fibonaci là dãy số gồm các số hạng F(n) với:
//F0 =F1=1 ;  Fn = Fn-1 + Fn-2
public class baiTap7 {
	public static void main(String[] args) {
		run();
	}
	//run
	public static void run() {
		String input = input("nhập vào số n");
		int n = Integer.parseInt(input);
		// số hạng thứ n của dãy Fibo
		fibonaci(n);
	}
	//nhâp vào n
	public static String input(String masege) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.println(masege);
		result = sc.next();
		
		return result;
	}
	//tính dãy fibonaci
	public static int fibonaci(int n) {
		int result = 0;
		int f0 = 1;
		int f1 = 1;
		int num = 0;
		
		for (int i = 1; i <= n; i++) {
			f0 = f1;
			f1 = num;
			num = f0 + f1;
			System.out.print(num + " ");
		}
		
		return result;
	}
}

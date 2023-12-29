package chuong6;

import java.util.Scanner;

public class baiTap8 {
	public static void main(String[] args) {
		run();
	}
	//run
	public static void run() {
		String input = "";
		int a = 0;
		int b = 0;
		
		input = input("nhập vào số a: ");
		a = Integer.parseInt(input);
		input = input("nhập vào số b: ");
		b = Integer.parseInt(input);
		
		input = input("USCLN là: " + timUSCLN(a, b) + 
				"\nBSCNN là : " + timBSCNN(a, b));
		
		
	}
	//nhập vào a,b
	public static String input(String manege) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.println(manege);
		result = sc.next();
		
		return result;
	}
	//tìm USCLN
	public static int timUSCLN(int a , int b) {
		while(a != 0 && a != 0) {
			if (a >= b) {
				a = a % b;
			}else {
				b = b % a;
			}
		}
			
		return a + b;
	}
	//tim ,BSCNN
	public static int timBSCNN(int a , int b) {
		int uscln = timUSCLN(a, b);
		int bscnn = 0;
		
		bscnn = (a * b) /uscln;
		
		return bscnn;
	}
}


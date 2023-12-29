/*Viết các hàm tính các biểu thức sau với n là số nguyên dương do người dùng nhập vào từ bàn phím
 * A = Tổng các số lẻ nhỏ hơn hay bằng n
B = Tích các bội số của 3 và nhỏ hơn hoặc bằng n
C = 1 + 1/2 + 1/3 + . . . + 1/n-1.
D = 2 * 4 * 6 * … 2n.
E = N! = 1 * 2 * . .  * n.

tên: Nguyễn Hữu Quyện
 * */
package chuong6;

import java.util.Scanner;

public class baiTap2 {
	public static void main(String[] args) {
		run();
	}
	//run
	 public static void run() {
		 String input = "";
			int n = 0;
			char ch = 0;
			
			do {
				input = input("nhập vào số nguyên dương n:");
				n = Integer.parseInt(input);
			}while(n <= 0);	
			
				input = input("A = Tổng các số lẻ nhỏ hơn hay bằng n \n"
						+ "B = Tích các bội số của 3 và nhỏ hơn hoặc bằng n \n"
						+ "C = 1 + 1/2 + 1/3 + . . . + 1/n-1. \n"
						+ "D = 2 * 4 * 6 * … 2n \n"
						+ "E = N! = 1 * 2 * . .  * n \n");
				ch = input.charAt(0); 
				
			ketQua(n,ch);
	 }
	//menu lựa chọn
	public static void ketQua(int n , char ch) {
		
		switch (ch) {
		case 'a' , 'A':
			System.out.println("tổng các số lẻ nhỏ hơn hay bằng n là: " + resultA(n) );
			break;
		case 'b' , 'B':
			System.out.println("tích các bội số của 3 và nhỏ hơn hay bằng n là: " + resultB(n));
			break;
		case 'c' , 'C':
			System.out.println("1 + 1/2 + 1/3 + . . . + 1/n-1 là: " + resultC(n));
			break;
		case 'd' , 'D':
			System.out.println("2 * 4 * 6 * … 2n là: " + resultD(n));
			break;
		case 'e' ,'E':
			System.out.println("N! = 1 * 2 * . .  * n là: " + resultE(n));
			break;
		default:
			System.out.println("yêu cầu chọn lại");
			break;
		}
		
		
	}
	// N! = 1 * 2 * . .  * n
	public static int resultE(int n) {
		int result = 1;
		
			for(int i = 1 ; i <= n ; i++) {
				result *= i;
			}
		
		return result;
	}
	//2 * 4 * 6 * … 2n
	public static int resultD(int n) {
		int result = 1;
		
			for(int i = 2 ; i <= n ; i+=2) {
				result *= i;
			}
		
		return result;
	}
	//1 + 1/2 + 1/3 + . . . + 1/n-1.
	public static double resultC(int n) {
		double result = 0;
		
			for(int i = 1 ; i <= n; i++) {
				result += 1.0 / i;
			}
		
		return result;
	}
	//tích các bội số của 3 và nhỏ hơn hay bằng n
	public static int resultB(int n) {
		int result = 1;
		
			for(int i = 3 ; i <= n ; i+= 3) {
				result *= i;
			}
		
		return result;
	}
	//tổng các số lẻ nhỏ hơn hay bằng n
	public static int resultA(int n) {
		int result = 0;

			for(int i = 1 ; i <= n ; i+=2) {
				result += i;
			}
		
		return result;
	}
	//nhập vào n
	public static String input(String massege) {
		Scanner sc = new Scanner(System.in);
		String n = "";
		
		System.out.println(massege);
		n = sc.next();
		
		return n;
	}
}

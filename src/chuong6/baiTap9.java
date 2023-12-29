package chuong6;

import java.util.Iterator;
import java.util.Scanner;

//10.Viết chương trình đếm các số hoàn hảo nhỏ hơn hoặc bằng N
//, với N là số nguyên dương được nhập vào từ bàn phím.
public class baiTap9 {
	public static void main(String[] args) {
		run();
	}
	//kiểm tra số đó có phải là số hoàn hảo hay không
	public static boolean kiemTraSoHoanHao(int n) {
		boolean result = true;
		int tong = 0;
		
		for (int i = 1; i <= n / 2 ; i++) {
			if (n % i == 0) {
				 tong += i;
				 }
			}
		if (tong == n) {
			result = false;
		}
		
		return result;
	}
	//hàm chạy và sử lý cá hàm khác
	public static void run() {
		String input = "";
		int n = 0;
		int demSoHoanHao = 0;
		
		do {
			input = input("nhập vào số nguyên dương n: ");
			n = Integer.parseInt(input);
		} while (n<0);
		
		
		for (int i = 1; i <= n; i++) {
			if (kiemTraSoHoanHao(i)) {
				demSoHoanHao++;
			}
		}
		input = input("có " + demSoHoanHao + " số hoàn hảo <= n");
	}
	//hàm sử khai báo chủi
	public static String input(String masage) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.print(masage);
		result = sc.next();
		
		return result;
	}
}

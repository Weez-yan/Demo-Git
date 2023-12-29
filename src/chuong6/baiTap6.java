package chuong6;

import java.util.Scanner;

//Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số hoàn hảo hay không?
public class baiTap6 {
	public static void main(String[] args) {
		run();
	}
	//run
	public static void run() {
		String input = input("nhập vào số n ");
		int n = Integer.parseInt(input);
		
		if (soHoanHao(n) == true) {
			input = input("là số hoàn hỏa");
		}else {
			input = input("không phải là số hoàn hảo");
		}
	}
	//nhập vào số nguyên
	public static String input(String masage) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.println(masage);
		result = sc.next();
		
		return result;
	}
	//kiểm tra xem số đó có phải là số hoàn hỏa hay không
	public static boolean soHoanHao(int n) {
		boolean result = false;
		int num = 0;
		
		for (int i = 1; i < n; i++) {
			if (n%i==0) {
				num += i;
			}
			if (num == n) {
				result = true;
			}
		}
		
		return result;
	}
}

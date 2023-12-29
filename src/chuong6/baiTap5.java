package chuong6;

import java.util.Scanner;

//4.Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số chính phương hay không?
public class baiTap5 {
	public static void main(String[] args) {
		run();
	}
	//run
	public static void run() {
		String input = input("nhập vào n ");
		int n = Integer.parseInt(input);
		
		if (soChinhPhuong(n) == true) {
			input = input("là số chính phương");
		}else {
			input = input("không phải là số chính phương");
		}
	}
	//nhâpk vào n
	public static String input(String messenger) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.println(messenger);
		result = sc.next();
		
		return result;
	}
	//kiểm tra xem có phải là số chính phương hay khôgn
	
	public static boolean soChinhPhuong(int n) {
		double canBacHai = Math.sqrt(n);
		boolean laChinhPhuong = canBacHai - Math.floor(canBacHai) == 0;
		
		return laChinhPhuong;
	}
}

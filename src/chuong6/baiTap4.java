package chuong6;
//3.Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số nguyên tố hay không? 
import java.util.Scanner;

public class baiTap4 {
	public static void main(String[] args) {
		run();
	}
	//run
	public static void run() {
		String input = input("nhập vào số n: ");
		int n = Integer.parseInt(input);
		
		if (soNguyenTo(n) == true) {
			input = input("là số nguyên tố");
		}else {
			input = input("không phải là số nguyên tố");
		}
	}
	//nhập vào n
	public static String input(String massege) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.println(massege);
		result = sc.next();
		
		return result;
	}
	//kiểm tra có phải số nguyên tố hay không
	public static boolean soNguyenTo(int n) {
		boolean result = true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
}

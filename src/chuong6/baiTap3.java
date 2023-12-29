package chuong6;
//2.Viết chương trình nhập vào một số nguyên dương rồi in ra tất cả các ước số của số đó.
import java.util.Scanner;

public class baiTap3 {
	public static void main(String[] args) {
		run();
	}
	//run
	public static void run() {
		String input = input("nhập vào n: ");
		int n = Integer.parseInt(input);
		
		uocSo(n);
	}
	//nhập vao n
	public static String input(String massege) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.println(massege);
		result = sc.next();
		
		return result;
	}
	//tính ước số
	public static int uocSo(int n) {
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		return result;
	}
}

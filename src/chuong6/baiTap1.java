/*  Viết hàm nhập vào một số nguyên dương n.
 *  Kiểm tra điều kiện nếu n <= 0 thì nhập lại. Hàm trả về số nguyên vừa nhập.
 *  
 *  Tên : Nguyễn Hữu Quyện
 * */
package chuong6;

import java.util.Scanner;

public class baiTap1 {
	public static void main(String[] args) {
		String input = "";
		int n = 0;
		
		do {
			input = input("nhập vào số n: ");
			n = Integer.parseInt(input);
		}while(n <= 0);
		
	}
	public static String input(String massege) {
		Scanner sc = new Scanner(System.in);
		String result = "";

		System.out.println(massege);
		result = sc.next();
	
		return result;
	}
}

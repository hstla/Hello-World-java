/* 2022.03.15
 * 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다. 
팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
 */

import java.util.Scanner;
import java.util.Arrays;

public class MyGugudan {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오:");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		// 사용자에게 받은 스트링을 ,로 쪼개고 인트로 변환.
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
//		System.out.println(first +","+ second);
		int[] arrGugudan = new int[first];
		
		for(int i=0;i<first;i++) {
			arrGugudan[i] = (i+1);
		}
//		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<arrGugudan.length;i++) {
			System.out.println((i+1)+"단입니다 :");
			for(int j=0;j<second;j++) {
				System.out.println(arrGugudan[i]*(j+1));
			}
		}
	}
}
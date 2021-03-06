/*
  2022.03.14
	자바를 이용한 간단한 구구단.
 */

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		// Scanner를 이용하여 사용자에게 원하는 값을 얻고 값의 구구단을 출
		System.out.println("구구단 중 출력할 단은??");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 2) {
			System.out.println("2와 9사이의 값을 입력하시오");
		} else if (number > 9) {
			System.out.println("2와 9사이의 값을 입력하시오");
		} else {
			System.out.println("number : " + number);
		    
		    for(int i = 1; i<10; i++) {
		    	System.out.println(number + "*" +i+"=" + number * i);
		    }
		}
		
		
//		반복문인 for문을 이용하여 중복된 코드를 최소화한 1단 ~ 9단.
		int[] result = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<9;i++) {
			System.out.println((i+1)+"의 구구단 :");
			for(int j=1;j<10;j++) {
				System.out.println(result[i] * j);
			}
		}
		
	} 
}

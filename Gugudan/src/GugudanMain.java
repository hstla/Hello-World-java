import java.util.Scanner;

/*
 * 2022.03.14 
 * Class는 대문자 시작, method는 소문자시작으로 한다.
 * Class.method를 하면 다른 Class에 있는 함수를 사용할 수 있다.
 * main method가 없으면 실행이 불가능하다.
 */
public class GugudanMain {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=2;i<=num;i++) {
			System.out.println(i +"의 구구단 :");
			int[] result = MethodGugudan.calculate(i);
			MethodGugudan.print(result);
		}	
	}
}

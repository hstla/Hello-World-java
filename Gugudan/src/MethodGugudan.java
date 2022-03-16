/*
  2022.03.14
  메소드를 이용한 구구단 출력.
 */
public class MethodGugudan {
	// int times를 인자로 받고 int배열를 리턴하는 함수
	// 입력받은 숫자의 단을 배열에 저장하고 리턴하는 함수.
	public static int[] calculate(int times) {
		int[] result = new int[times];
		for(int i=0;i<result.length;i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	// int배열을 인자로 받고 리턴이 없는 함수.
	// 배열을 출력해주는 함수.
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	} 
}
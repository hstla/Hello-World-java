import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
//        System.out.println("두 수의 합: " + (a+b));
        System.out.printf("%d와 %d의 값은 %d입니다!",a,b,(a+b));
        scan.close();
    }
}

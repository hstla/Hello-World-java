import java.util.Scanner;

public class Calendar {
    public static int[] maxMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void printMonth() {
        System.out.println("일 월 화 수 목 금 토\n" +
                "--------------------\n" +
                " 1  2  3  4  5  6  7\n" +
                " 8  9 10 11 12 13 14\n" +
                "15 16 17 18 19 20 21\n" +
                "22 23 24 25 26 27 28");
    }

    public static void main(String[] args) {
        String PROMPT="cal> ";
        Scanner scan = new Scanner(System.in);
        System.out.println("반복횟수를 지정해주세요");
        int loop = scan.nextInt();
        for(int i=0;i<loop;i++) {
            System.out.println("달을 입력해주세요: ");
            System.out.print(PROMPT);
            int input = scan.nextInt();
            if(input > 0 && input < 13) {
                System.out.printf("%d월은 %d일까지 있습니다\n", input, maxMonth[input - 1]);
            } else{
                System.out.println("1~12월 사이를 입력해주세요.\n");
            }
        }
        scan.close();
    }
}

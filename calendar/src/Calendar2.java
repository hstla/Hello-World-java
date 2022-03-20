import java.util.Scanner;

public class Calendar2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Month = Calendar.maxMonth;
        while (true) {
            System.out.println("달을 입력하시오");
            String PROMPT = "cal>";
            System.out.print(PROMPT);
            int month = scan.nextInt();
            if (month == -1) {
                break;
            }
            if (month > 12 || month<0) {
                System.out.println("1~12월사이를 입력해주세요!");
                continue;
            }
            System.out.printf("%d월은 %d일까지 있습니다.",month, Month[month-1]);
        }
        System.out.println("끝");
        scan.close();
    }

}

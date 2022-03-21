import java.util.Scanner;

public class Calendar3 {
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
        String PROPT = "cal> ";
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("보고 싶은 달을 입력하시오.");
            System.out.print(PROPT);
            int inpMonth = scan.nextInt();
            if(inpMonth==-1){
                break;
            } else if(inpMonth<1||inpMonth>12){
                System.out.println("1~12월 사이를 입력하시오");
            }
            switch (inpMonth) {
                case 2:
                    printMonth();
                    break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    printMonth();
                    System.out.println("29 30 31");
                    break;
                case 4: case 6: case 9: case 11:
                    printMonth();
                    System.out.println("29 30");
                    break;
            }
        }
        System.out.println("끝");
    }
}

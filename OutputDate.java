import java.util.Scanner;
public class OutputDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = input.nextInt();
        System.out.println("请输入日期");
        int day = input.nextInt();
        int date = (month-1)*30 + day;
        System.out.println("这是2014年的第"+date+"天");
    }
}

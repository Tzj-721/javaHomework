import java.util.Scanner;
public class SeasonCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int season = input.nextInt();
        switch(season){
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("这是冬季");
                break;
        }
    }
}

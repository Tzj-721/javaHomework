import java.sql.SQLOutput;
import java.util.*;
public class CheckStandard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//创建Scanner对象
        int score = input.nextInt();//获取键盘输入
        if(score<0){
            System.out.println("你输入的数据有误");
        } else if (score>=0 && score<60){
            System.out.println("成绩不合格");
        } else {
            System.out.println("成绩合格");
        }
    }
}

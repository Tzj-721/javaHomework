import java.util.Scanner;
public class ReverseEqual {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();
        /*
        //转化为StringBuilder对象
        StringBuilder sb = new StringBuilder(str);
        String strReverse = sb.reverse().toString();
        if (strReverse.equals(str) ) {
            。System.out.println("你输入的是回文数");
        } else {
            System.out.println("你输入的不是回文数");
        }

        */
        //函数方法
        String newStr = "";
        int len = str.length();
        boolean isReverse = true;
        //字符串不可重复赋值操作
        for(int i = 0;i<len/2;i++){
            //用于直接判断
            if(str.charAt(len-i-1) != str.charAt(i)){
                isReverse = false;
            }
        }
        if(isReverse){
            System.out.println("你输入的是回文数");
        }
        else{
            System.out.println("你输入的不是回文数");
        }
    }
}
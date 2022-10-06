import java.util.Scanner;


public class Transformation {
    public static  int change(char ch){
        int num = 0;
        if(Character.isDigit(ch)){
             num = Integer.parseInt(""+ch);
        }
        if(ch>='A'&&ch<='F'){
             num = 10 + (ch - 'A');
        }
        else{
            System.out.println("数据错误");
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str16 = input.nextLine();
        int len = str16.length();
        //取每一位数
        int sum = 0;
        for(int i = len - 1;i>=0;i--){//最后开始加起来
            sum += change(str16.charAt(i))*Math.pow(16,len-i-1);
        }
        System.out.println(sum);
    }
}

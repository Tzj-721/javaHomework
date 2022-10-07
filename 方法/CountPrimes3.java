import java.util.ArrayList;
import java.util.Scanner;

public class CountPrimes3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        ArrayList <Integer>res = new ArrayList<Integer>();
        if (num <= 2) {
            System.out.println("没有质数");
        } else {
            for (int i = 2; i < num + 1; i++) {//还要检测自己
                boolean flag = true;
                //遍历数组之中的元素
                for (Integer j : res) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    //加入进列表
                    res.add(i);
                }
            }

            System.out.println(num + "之内有" + res.size() + "个质数");
            System.out.print("[ ");
            for (int i = 0; i < res.size(); i++) {
                if (i == res.size() - 1) {
                    System.out.print(res.get(i));
                } else {
                    System.out.print(res.get(i) + ",");
                }
            }
            System.out.print("]");
        }
    }
}

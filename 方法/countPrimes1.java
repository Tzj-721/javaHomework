import java.util.Scanner;
import java.util.ArrayList;

public class countPrimes1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        ArrayList res = new ArrayList();
        if (num <= 2) {
            System.out.println("没有质数");
        } else {
            for (int i = 2; i < num + 1; i++) {//还要检测自己
                boolean flag = true;
                for (int j = 2; j < i; j++) {
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


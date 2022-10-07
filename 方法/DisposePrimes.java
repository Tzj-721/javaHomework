import java.util.ArrayList;
import java.util.Scanner;

public class DisposePrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int numx = num;
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (num <= 2) {
            System.out.println("没有质数");
        } else {
            for (int i = 2; i < num + 1; i++) {//还要检测自己
                boolean flag = true;
                //遍历数组之中的元素
                for (int j = 2; j < i; j++) {//此处还是要用这种，因为质因数分解的原因
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

        }

        ArrayList<Integer> resx = new ArrayList<>();
        //该代码存在数组越界的错误
        //若用数组试试
        for(int i=0;i<res.size();i++){
            if(num%res.get(i)==0){
                resx.add(res.get(i));
                num /= res.get(i);
            }
            if(num == 1){
                break;
            }
        }


        //展示输出
        System.out.print(numx+"=");
        for(int i=0;i<resx.size();i++){
            if(i == resx.size()-1) {
                System.out.print(resx.get(i));
            }
            else{
                System.out.print(resx.get(i)+"*");
            }
        }
    }
}
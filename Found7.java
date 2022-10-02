public class Found7 {
    public static void main(String[] args){
        int sum = 0;//用于记录总和
        int cnt = 0;//用于记录7的倍数个数
        for(int i = 1;i<=100;i++){
            if(i%7==0){
                cnt++;
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println(cnt);
    }
}

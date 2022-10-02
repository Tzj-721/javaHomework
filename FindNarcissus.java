public class FindNarcissus {
    public static boolean isNarcissus(int num) {
        int low = num % 10;
        int mid = num / 10 % 10;
        int high = num / 100;
        if(Math.pow(low,3)+Math.pow(mid,3)+Math.pow(high,3) == num){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            if(isNarcissus(i)){
                System.out.println(i);
            }
        }
    }
}

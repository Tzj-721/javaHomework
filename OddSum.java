public class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<=99;i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}

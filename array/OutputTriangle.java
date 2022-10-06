public class OutputTriangle {
    public static void main(String[] args) {
        //初始化数组
        int length = 10;
        int[][] arr = new int[length][];
        for(int i = 0;i<10;i++){
            arr[i] = new int[i+1];
        }
        //对数组进行赋值
        for(int i = 0; i<length; i++){
            for(int j = 0; j<arr[i].length;j++){
                if(j==0 || j == arr[i].length-1){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        //输出字符串
        for(int i = 0; i<length; i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

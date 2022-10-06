public class OutputMatrix {
    //输出矩阵的方法
    public static void displayMatrix(int[][] matr){
        for(int i = 0; i < matr.length;i++){
            for(int j = 0; j < matr[0].length;j++){
                System.out.print(matr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    //矩阵的加法
    public static int[][] addMatrix(int[][] a,int[][] b ){
        int length = a.length;
        int row = a[0].length;
        int[][] newMatrix= new int[length][row];
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a[0].length;j++){
                newMatrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return newMatrix;
    }
    //矩阵的乘法
    public static int[][] mutiplyMatrix(int[][] a,int[][] b){
        int length = a.length;
        int row = a[0].length;
        int[][] newMatrix= new int[length][row];
        for(int i = 0; i<length;i++){
            for(int j = 0;j < row; j++){
                for(int k = 0; k<row;k++){
                    newMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return newMatrix;
    }
    //主方法
    public static void main(String[] args) {
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{2,2,2},{1,1,1},{3,3,3}};
        System.out.println("c+d的值为");
        displayMatrix(addMatrix(c,d));
        System.out.println("c*d的值为");
        displayMatrix(mutiplyMatrix(c,d));
    }
}

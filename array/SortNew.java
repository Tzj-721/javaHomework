import java.sql.SQLOutput;
import java.util.*;
public class SortNew {
    /*
    //快速排序算法
    public static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int Partition(int[] arr ,int low,int high){
        int pivotKey = arr[low];
        int pivot = low;
        while(low<=high){
            while(low <= high && arr[high] > pivotKey) high--;
            while(low <= high && arr[low] < pivotKey) low++;
            if(low < high) {
                swap(arr,low,high);
            }
        }
        swap(arr,low,pivot);
        return low;
    }
    public static void QSort(int[] arr,int low,int high){
        int pivot = 0;
        if(low<high){
            pivot = Partition(arr, low, high);
            QSort(arr, low, pivot-1);
            QSort(arr,pivot+1,high);
        }
    }

     */
    //交换函数
    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //寻找轴的方法
    static int partition(int[] arr, int leftBound,int rightBound) {
        int pivot = arr[rightBound]; //指定数组最右边的数是用来比较的值 轴
        int left = leftBound;
        int right = rightBound - 1;

        while (left <= right) {
            while(left <= right && arr[left] <= pivot) left++;
            while(left <= right && arr[right] > pivot) right--;

            if (left < right) {
                //如果 左边的数比右边的数小  两个数交换
                swap(arr, left, right);
            }
        }
        //把left最后一次指向的位置与pivot（轴）的位置交换
        swap(arr, left, rightBound);
        return left; //返回轴的位置
    }

    public static void QSort(int[] arr,int leftBound,int rightBound) {
        if(leftBound >= rightBound) return;
        int mid= partition(arr, leftBound, rightBound); //得到轴的位置
        QSort(arr, leftBound, mid-1); //左边排序
        QSort(arr, mid+1, rightBound); //右边排序
    }

    public static void main(String[] args) {
        Random random = new Random();//创建Random对象
        int[] nums = new int[11];//存储数据数组的定义
        for(int i = 0;i<10;i++){
            nums[i] =10 + random.nextInt(90);
            //测试数据的准确性
            //System.out.println(nums[i]);
        }
        QSort(nums,0, 9);
        //排序后数组测试
        for(int i = 0;i < 10;i++){
            System.out.print(nums[i]+"\t");
        }
        //输入一个新的数
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("请输入你的新数字");
        int newScore = input.nextInt();
        int index = 0;
        for(int i = 0;i<10;i++){
            if(newScore >= nums[i] && newScore < nums[i+1]){
                index = i + 1;//为新数分配位置
            }
        }
        //从标记点整体后移
        for(int i = 9; i >=index;i--){
            nums[i+1] = nums[i];
        }
        nums[index] = newScore;
        //输出排序后的数组
        for(int i = 0;i < 11;i++){
            System.out.print(nums[i]+"\t");
        }
    }
}

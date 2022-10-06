import java.util.Scanner;//导入工具包

public class FoundChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = (input.nextLine()).charAt(0);
        String str = input.nextLine();
        /*
        //若用lastIndexOf
        int pos = str.lastIndexOf(ch);
        if (pos == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(pos);
        }

         */
        //若用charAt（）方法
        int len = str.length();
        int pos = -1;
        for(int i = 0;i<len;i++){
            if(ch == str.charAt(i)){
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(pos);
        }
    }
}
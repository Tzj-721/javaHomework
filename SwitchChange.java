public class SwitchChange {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String str = input.next();
        char num = str.charAt(0);
        switch(num){
            case 'a':
                num= 'A' ;
                System.out.println(num);
                break;
            case 'b':
                num = 'B';
                System.out.println(num);
                break;
            case 'c':
                num = 'C';
                System.out.println(num);
                break;
            case 'd':
                num = 'D';
                System.out.println(num);
                break;
            case 'e':
                num = 'E';
                System.out.println(num);
                break;
            default:
                System.out.println("other");
                break;
        }

    }
}

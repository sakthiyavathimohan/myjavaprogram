import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num = Sc.nextInt();
        String numStr = Integer.toString(num);

        if(numStr.endsWith("2") || numStr.endsWith("4") || numStr.endsWith("6") || numStr.endsWith("8") || numStr.endsWith("0")){
            System.out.println("this is even");
        }else{
            System.out.println("this is odd");
        }
        Sc.close();
    }
}

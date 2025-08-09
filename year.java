import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the year" );
        int year = Sc.nextInt();
        //System.out.println("enter the year" );
        if(year % 100 != 0 && year % 4 ==0  || year % 400 ==0){
            System.out.println("this is leap year");
        }else{
            System.out.println("this is not a leap year");
        }
        //System.out.println("enter the year" );
       Sc.close();

    }
}

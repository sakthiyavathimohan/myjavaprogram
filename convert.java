/*import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the feet to inches:" );
        double feet = Sc.nextInt();
        double inches = feet * 12;
        System.out.println(feet +"feet to inches" + inches);
        //Scanner Sc = new Scanner(System.in);
        System.out.println("enter the feet to miles:" );
        //double feet = Sc.nextInt();
        double miles = feet / 5280;
        System.out.println(miles +"feet to miles" + miles);
        Sc.close();

    }
}*/
import java.util.Scanner;


public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value in feet: ");
        double feet = sc.nextDouble();

        double inches = feet * 12;
        double miles = feet / 5280;

        System.out.println(feet + " feet = " + inches + " inches");
        System.out.println(feet + " feet = " + miles + " miles");

        sc.close();
    }
}

//import java.util.Scanner;

import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        //String vowels = "a,e,i,o,u";
        //String consonants = " B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z";
        //int d = 0,1,2,3,4,5,6,7,8,9 ;
        //int result;
        //String result;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = Sc.next().charAt(0);
        //String vowels = sc.nextLine();
        if(Character.isDigit(ch)){
            System.out.println("this is digit");
        }
        //Scanner sc = new Scanner(System.in);
        //String consonants = sc.nextLine();
        else if (Character.isLetter(ch)){
            System.out.println("this is consonants");
        }
        //Scanner sc = new Scanner(System.in);C
        //int d = sc.nextInt();
        //else if(result.equals(d)){
            //System.out.println("this is digit")
        else if ("AEIOUaeiou".indexOf(ch) != -1){
            System.out.println("this is vowels");
        }else{
            System.out.println("this is symbol");
        }
         //Scanner sc = new Scanner(System.in);
        // String vowels = sc.nextLine();



    }
}
 
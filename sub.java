public class sub {
    public static void main(String[] args) {
        if(args.length !=2){
           System.out.println("provide input");
           return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        int Sub = num1-num2;

        System.out.println("sub:" +Sub);
    
        
    }
}

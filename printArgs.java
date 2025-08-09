public class printArgs {
    public static void main(String[] args) {
        if(args.length ==0){
            System.out.println("no user input  provided");}
        else{
            System.out.println("user input provided below");
            for (String arg : args){
                System.out.println(arg);
            }
        
        }
    }
}

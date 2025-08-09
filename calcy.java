public class calcy {
    public static void main(String[] args) {
        if(args.length !=3){
            System.out.println("operation begins");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        String operation= args[1];
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        if(operation.equals("+")){
               result = num1+num2;
        }
        else if(operation.equals("-")){
            result = num1-num2;
        }else{
            System.out.println("only support for + , -");
            return;

        }
        System.out.println("result:" + result);

    }
}

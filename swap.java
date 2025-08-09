public class swap {
    public static void main(String[] args){
        String swap1 = "abc";
        String swap2 = "dfg";
        swap1 = swap2;
        swap2 = swap1;
        System.out.println("swap1:"+swap1);
        System.out.println("swap2:"+swap2);
    }
}
public class binary {
    public static void main(String[] args) {
        float[] arr = {1.1f,2.2f,3.3f,4.4f,5.5f};
        float key = 4.4f;
        int low =0,high=arr.length-1;
        boolean found = false;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==key){
               System.out.println("element found"+ key);
               found = true;
               break;
            }else if(arr[mid]<=key){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }if(!found){
            System.out.println("not found");
        }
    }
}

public class majority{
   
    public static void main(String[]args){
        int arr[] ={5,7,4,7,4,4,5,4,4,7,4,4};
        System.out.println(mje(arr,arr.length));
    }
    public static  int mje(int arr[], int n){
        int candidate = arr[0];
        int count = 1;
        for (int i=1; i<n; i++){
            if(arr[i] == candidate){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                candidate = arr[i];
                count =1;
            }
        }
        count = 0;
        for(int val: arr){
            if(val == candidate){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }else{
            return -1;
        }
    }
}
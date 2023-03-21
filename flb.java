/*
 * in this java program we are going to find first and last index of a element using binary search alogorithm
 * int the method ,in the firstloop we are going to first index
 * in the method , in the secondLoop we are going to find last index
 * 
 */
public class fandl {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,5,5,5,5,5,5,6,7,7,7,8};
        gif(arr,5);
        System.out.println("hello");
}
public static void gif(int arr[], int target){
    int left=0, right=arr.length-1;
    int first=-1;
    while(left <= right){
        System.out.println(1);
        int mid=(left + right) / 2;
        if(arr[mid]==target){
            first=mid;
            right=mid-1;
        }
        else if(arr[mid]<target){
            left=mid+1;
        }else{
            right=mid-1;
        }
    }
        left=0;
        right=arr.length-1;
        int last=-1;
        while(left <= right){
            int mid=(left + right)/2;
            if(arr[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
    }
    System.out.println(first+" "+last);
}

}

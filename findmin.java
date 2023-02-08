public class findmin{
    public static void main(String args[]){
        int a[] ={23,23,21,12,3,4,5,8,7};
        int mi=findmin1(a);
        System.out.println(mi);
    }
public static int findmin1(int arr[]){
    int left=0,right=arr.length-1;
    while(left<right){
        int mid=(left+right)/2;
        if(arr[mid]<arr[right]){
          right=mid;
          left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return left;
}}

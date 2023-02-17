
import java.util.*;
public class subsets {
    public static void main(String args[]){
        int arr[]={8,90,4,20,10,34};
        int target=120;
        int i=0;
        tss(arr,i,target,new ArrayList<>());
    }
    public static void tss(int arr[],int i,int target,ArrayList<Integer> ans){
        if(i==arr.length){
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        tss(arr,i+1,target-arr[i],ans);
        ans.remove(ans.size()-1);
        tss(arr,i+1,target,ans);
    }
    
}

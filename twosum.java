import java.util.*;
import java.lang.*;//2sum problem
public class twosum{
    public static void main(String args[]){
       HashMap<Integer,Integer> map=new HashMap<>();
       int [] arr ={11,4,7,9,14,13};
       int target=17;
       int []ans=new int [2];
       for(int i=0;i<arr.length;i++){
        int sno=target-arr[i];
        if(map.containsKey(sno)){
            ans[0]=map.get(sno);
            ans[1]=i;
            break;
        }
        map.put(arr[i],i);
       }
       System.out.println(ans[0]+" "+ans[1]);
    }
    
}

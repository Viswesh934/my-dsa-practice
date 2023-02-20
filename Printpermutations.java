<<<<<<< HEAD
import java.util.*;
public class Printpermutations {
    public static void main(String args[]){
        int []arr={1,2,3};
        Printpermutation(arr,0,new boolean[arr.length],new ArrayList<Integer>());

    }
    public static void Printpermutation(int arr[],int pos,boolean [] selected,ArrayList<Integer> ans){
        if(pos==arr.length){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(selected[i]==false){
                selected[i]=true;
                ans.add(arr[i]);
                Printpermutation(arr,pos+1,selected,ans);
                selected[i]=false;
            ans.remove(ans.size()-1);
            }
        } 

    } 
}
=======
import java.util.*;
public class Printpermutations {
    public static void main(String args[]){
        int []arr={1,2,3};
        Printpermutation(arr,0,new boolean[arr.length],new ArrayList<Integer>());

    }
    public static void Printpermutation(int arr[],int pos,boolean [] selected,ArrayList<Integer> ans){
        if(pos==arr.length){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(selected[i]==false){
                selected[i]=true;
                ans.add(arr[i]);
                Printpermutation(arr,pos+1,selected,ans);
                selected[i]=false;
                ans.remove(ans.size()-1);
            }
        }

    } 
}
>>>>>>> 3f55b46a0b05e454647dc1d57aa0747b7684deea

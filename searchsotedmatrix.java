/*
 * in this java program we are search an element in sorted matrix
 * usually we are needed two loops to search a matrix with bruteforce method .
 * but in this algorithm we are going to find it by using column wise and row wise which is simlar to binarysearch.
 */
public class searchsotedmatrix {
    public static void main(String [] args){
        int arr[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                       {9, 10 , 11, 12},
                        {13, 14, 15, 16}};
        int target = 13;
        System.out.println(search(arr, target));
        
    }
    public static boolean search(int arr[][], int target){
        int i=0, j=arr.length-1;
        while(i<=arr.length-1 && j>=0){
            if(arr[i][j]==target){
                return true;
            }else if(arr[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
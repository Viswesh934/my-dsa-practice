public class transpose {
    public static void main(String [] args){
        int arr[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                       {9, 10 , 11, 12},
                        {13, 14, 15, 16}};
        transpose(arr);
        print(arr);
    }
    public static void transpose(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void print(int arr[][]){
            for(int a[]: arr){
                for(int val: a){
                    System.out.print(val + " ");
                }
                System.out.println();
         }
}
}

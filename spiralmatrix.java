public class spiralmatrix {
    public static void main(String [] args){
        int arr[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                       {9, 10 , 11, 12},
                        {13, 14, 15, 16}};
        spi(arr);
    }
    public static void spi(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int count =0;
        int cmin =0; int cmax = arr[0].length-1;
        int rmin =0; int rmax = arr.length-1;
        while(count < n*m){
            //top boundary code
            for(int c= cmin; c<=cmax && count<n*m; c++){
                System.out.println(arr[rmin][c]);
                count++;
            }
            rmin++;
            //right boundary code
            for(int r= rmin; r<=rmax && count<n*m; r++){
                System.out.println(arr[r][cmax]);
                count++;
            }
            cmax--;
            //bottom boundary code
            for(int c1=cmax; c1>=cmin && count<n*m; c1--){
                System.out.println(arr[rmax][c1]);
                count++;
            }
            rmax--;
            //left boundary code
            for(int r1=rmax; r1>=rmin && count<n*m; r1--){
                System.out.println(arr[r1][cmin]);
                count++;
            }
            cmin++;
        }
    }
}
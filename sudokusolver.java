/*sudoku is a popular game among the folks who used to stick to newspapers the game involves numbers from 1-9  the row should have unique valus of 1 and 9 these values
should not coincide with the unique values in a column and a 3*3 sub matrix it is one of the hard problems but here in this code we followed a traditional approach of 
brute force and recursion.The empty slots of a given row comparing with grid and the columns can be filled with the possibilities if the possibility matches the empty
region it is useful if not it back tracks*/ 
public class sudokusolver{
    

public static void main(String args[]){
//A 9*9 grid '.'represent empty slots
 char [] []grid= {{'.', '2', '6', '5', '.', '.', '.', '9', '.'},
 {'5', '.', '.', '.', '7', '9', '.', '.', '4'},
 {'3', '.', '.', '.', '1', '.', '.', '.', '.'},
 {'6', '.', '.', '.', '.', '.', '8', '.', '7'},
 {'.', '7', '5', '.', '2', '.', '.', '1', '.'},
 {'.', '1', '.', '.', '.', '.', '4', '.', '.'},
 {'.', '.', '.', '3', '.', '8', '9', '.', '2'},
 {'7', '.', '.', '.', '6', '.', '.', '4', '.'},
 {'.', '3', '.', '2', '.', '.', '1', '.', '.'}};
solvesudoku(grid);


}
public static void solvesudoku(char [][] arr){
    //calling the solving function the function can't terminate until it's true
    if(sudokusolve(arr,0,0)){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


}
public static boolean sudokusolve(char[][] arr,int x,int y){
    if(x==arr.length){
        return true;
    }
    //incrementation of rows and columns
    int nx =y==8 ?x+1:x;
    int ny =y==8 ?0:y+1;
    if(arr[x][y]=='.'){
        for(int val=1;val<=9;val++){
            //checking if the value matches the empty slot using canplace function
            if(canplace(arr,x,y,val)==true){
                arr[x][y]=(char)(val+'0');
                //The value suitable is added to the char array 
                if(sudokusolve(arr,nx,ny)==true){
                    //calling the function recursively to check the matrix can be used as an escaping condition
                    return true;
                }
                //resetting the values as it is
                arr[x][y]='.';
            }
        }
    }
    else{
        
        if(sudokusolve(arr,nx,ny)==true){
            return true;
        }
    }

      return false;
}
public static boolean canplace(char arr[][],int x,int y,int val){
    //checking the columns
    for(int col=0;col<arr[0].length;col++){
        if(arr[x][col]==(char)(val+'0')){
            return false;
        }
 
    }
    //checking the rows
    for(int row=0;row<arr[0].length;row++){
        if(arr[row][y]==(char)(val+'0')){
            return false;
        }
    }
    x=x-(x%3);//leftmnost value of the grid
    y=y-(y%3);//rightmost value of the grid
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            //accessing elements of the 3*3 grid
            if(arr[x+i][y+j]==(char)(val+'0')){
                return false;
            }
        }
    }
    return true;
}


}

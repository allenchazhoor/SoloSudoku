  /**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Main {
  
  public Main() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  
  public static void main(String[] args) {
    
    //As the game starts, we are sent to the choosedifficulty method for players to choose their difficulty
    choosedifficulty();
    
  }
  public static void choosedifficulty(){
    
    //The variables needed are declared
    int difficulty;
    Scanner scan = new Scanner(System.in);
      do
    {
    //Ask the user for their difficulty setting
    System.out.println("Welcome to Sudoku! Please choose your difficulty.\n Enter\n 1 for Easy\n 2 for Medium\n 3 for Hard");
    difficulty=scan.nextInt();
   }while(difficulty>3||difficulty<1);//keep asking for a value difficulty
    
    //we move to the startgame method and send the difficulty variable with us
    startgame(difficulty);
    
  }
  public static void startgame(int difficulty){
    //This is where it gets complicated
    
    //Using a 9x9 2-D array makes it very easy to check the rows and columns for possible duplicates in Sudoku, but checking for duplicates in the 3x3 cells are very hard to do
    int [][] grid = new int [9][9];
    
    //But using 9 3x3 2-D array makes it very easy to check the 3x3 cells for duplicates, but very hard to check the rows and columns
    int [][] cellA = new int [3][3];
    int [][] cellB = new int [3][3];
    int [][] cellC = new int [3][3];
    int [][] cellD = new int [3][3];
    int [][] cellE = new int [3][3];
    int [][] cellF = new int [3][3];
    int [][] cellG = new int [3][3];
    int [][] cellH = new int [3][3];
    int [][] cellI = new int [3][3];
    //So I decided to use the benefits of both and combine them. There is a 9x9 array and 9 3x3 arrays that are made to be exactly identical.
    //When we check for duplictaes in the rows and columns, we search through the 9x9 array
    //When we check for duplicates in the 3x3 cells, we search through the 3x3 arrays
    
    //Declaring some variables for the loops
    int i=0,j=0;
    
    //Fill the 9x9 array with 0's
    for (i=0;i<9;i++)
    {
      for (j=0;j<9;j++)
      {
        grid[i][j]=0;
      }
    }
    
    //Filling all 9 of the 3x3 arrays 0's
    for (i=0;i<3;i++)
    {
      for (j=0;j<3;j++)
      {
        cellA[i][j]=0;
        cellB[i][j]=0;
        cellC[i][j]=0;
        cellD[i][j]=0;
        cellE[i][j]=0;
        cellF[i][j]=0;
        cellG[i][j]=0;
        cellH[i][j]=0;
        cellI[i][j]=0;
      }
    }
    
    //If the user chooses the easy difficulty...
    if (difficulty==1)
    {
      //The easy grid is set up
      //Every number is inputted in both the 9x9 array and the corresponding 3x3 array
      grid[0][0]=2;
      cellA[0][0]=2;
      grid[1][2]=6;
      cellA[1][2]=6;
      grid[2][1]=7;
      cellA[2][1]=7;
      grid[2][2]=4;
      cellA[2][2]=4;
      grid[0][3]=8;
      cellB[0][0]=8;
      grid[0][5]=4;
      cellB[0][2]=4;
      grid[0][8]=6;
      cellC[0][2]=6;
      grid[1][6]=5;
      cellC[1][0]=5;
      grid[2][6]=9;
      cellC[2][0]=9;
      grid[2][7]=2;
      cellC[2][1]=2;
      grid[3][0]=3;
      cellD[0][0]=3;
      grid[5][0]=4;
      cellD[2][0]=4;
      grid[3][4]=4;
      cellE[0][1]=4;
      grid[4][3]=3;
      cellE[1][0]=3;
      grid[4][5]=5;
      cellE[1][2]=5;
      grid[5][4]=6;
      cellE[2][1]=6;
      grid[3][8]=7;
      cellF[0][2]=7;
      grid[5][8]=9;
      cellF[2][2]=9;
      grid[6][1]=1;
      cellG[0][1]=1;
      grid[6][2]=9;
      cellG[0][2]=9;
      grid[7][2]=8;
      cellG[1][2]=8;
      grid[8][0]=5;
      cellG[2][0]=5;
      grid[8][3]=6;
      cellH[2][0]=6;
      grid[8][5]=8;
      cellH[2][2]=8;
      grid[6][6]=7;
      cellI[0][0]=7;
      grid[6][7]=4;
      cellI[0][1]=4;
      grid[7][6]=2;
      cellI[1][0]=2;
      grid[8][8]=1;
      cellI[2][2]=1;
      //Here is the answer to the easy grid.
      /*
       ___0__1__2_____3__4__5_____6__7__8___ 
       0 | [2][5][3] | [8][9][4] | [1][7][6] |  
       1 | [1][9][6] | [2][3][7] | [5][8][4] |  
       2 | [8][7][4] | [1][5][6] | [9][2][3] |  
       ------------------------------------- 
       3 | [3][8][1] | [9][4][2] | [6][5][7] |  
       4 | [9][6][7] | [3][8][5] | [4][1][2] |  
       5 | [4][2][5] | [7][6][1] | [8][3][9] |  
       ------------------------------------- 
       6 | [6][1][9] | [5][2][3] | [7][4][8] |  
       7 | [7][3][8] | [4][1][9] | [2][6][5] |  
       8 | [5][4][2] | [6][7][8] | [3][9][1] |  
       ------------------------------------- */
    }
    //We do the same for the medium difficulty...
    if(difficulty==2)
    {
      //And set up the medium grid for the user 
      grid[0][0]=1;
      cellA[0][0]=1;
      grid[1][1]=2;
      cellA[1][1]=2;
      grid[1][2]=3;
      cellA[1][2]=3;
      grid[0][5]=5;
      cellB[0][2]=5;
      grid[1][3]=4;
      cellB[1][0]=4;
      grid[1][5]=6;
      cellB[1][2]=6;
      grid[0][8]=4;
      cellC[0][2]=4;
      grid[1][7]=5;
      cellC[1][1]=5;
      grid[2][7]=6;
      cellC[2][1]=7;
      grid[3][0]=9;
      cellD[0][0]=9;
      grid[3][2]=4;
      cellD[0][2]=4;
      grid[5][1]=5;
      cellD[2][1]=5;
      grid[4][3]=5;
      cellE[1][0]=5;
      grid[4][4]=6;
      cellE[1][1]=6;
      grid[4][5]=7;
      cellE[1][2]=7;
      grid[3][7]=7;
      cellF[0][1]=7;
      grid[5][6]=8;
      cellF[2][0]=8;
      grid[5][8]=3;
      cellF[2][2]=3;
      grid[6][1]=4;
      cellG[0][1]=4;
      grid[7][1]=3;
      cellG[1][1]=3;
      grid[8][0]=2;
      cellG[2][0]=2;
      grid[7][3]=7;
      cellG[1][0]=7;
      grid[7][5]=1;
      cellG[1][2]=1;
      grid[8][3]=8;
      cellG[2][0]=8;
      grid[7][6]=9;
      cellI[1][0]=9;
      grid[7][7]=8;
      cellI[1][1]=9;
      grid[8][8]=7;
      cellI[2][2]=7;
    }
    //Same for the hard difficulty
    if(difficulty==3)
    {
      grid[0][1]=7;
      cellA[0][1]=7;
      grid[1][0]=9;
      cellA[1][0]=9;
      grid[0][5]=2;
      cellB[0][2]=2;
      grid[1][4]=6;
      cellB[1][1]=6;
      grid[2][3]=1;
      cellB[2][0]=1;
      grid[1][6]=3;
      cellC[1][0]=3;
      grid[2][7]=8;
      cellC[2][1]=8;
      grid[3][2]=8;
      cellD[0][2]=8;
      grid[4][1]=9;
      cellD[1][1]=9;
      grid[5][0]=3;
      cellD[2][0]=3;
      grid[3][4]=3;
      cellE[0][1]=3;
      grid[4][3]=7;
      cellE[1][0]=7;
      grid[4][5]=4;
      cellE[1][2]=4;
      grid[5][4]=5;
      cellE[2][1]=5;
      grid[3][8]=1;
      cellF[0][2]=1;
      grid[4][7]=6;
      cellF[1][1]=6;
      grid[5][6]=9;
      cellF[2][0]=9;
      grid[6][1]=1;
      cellG[0][1]=1;
      grid[7][2]=6;
      cellG[1][2]=6;
      grid[6][5]=7;
      cellH[0][2]=7;
      grid[7][4]=1;
      cellH[1][1]=1;
      grid[8][3]=4;
      cellH[2][0]=4;
      grid[7][8]=5;
      cellI[1][2]=5;
      grid[8][7]=3;
      cellI[2][1]=3;       
    }
    //We send all the relevant variables, such as the difficulty setting and the grids, to the gridstate method, which just shows the grid to the user
    gridstate(difficulty, grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
  }
  public static void gridstate(int difficulty, int[][]grid,int [][] cellA,int[][] cellB,int[][] cellC,int[][] cellD,int[][] cellE,int[][] cellF,int[][] cellG,int [][] cellH,int [][] cellI){
    //We draw the grid to the user
    int i,j;
    System.out.println("  ___0__1__2_____3__4__5_____6__7__8___");
    for (i=0;i<9;i++)
    {
      System.out.print(i + " | ");
      for (j=0;j<9;j++)
      {
        System.out.print("[" + grid[i][j] + "]");
        if (j==2||j==5||j==8)
        {
          System.out.print(" | ");
        }
      }
      System.out.println("");
      if (i==2||i==5||i==8)
        {
          System.out.println("  -------------------------------------");
        }
    }
    
    //We send the user and the necessary variables to the guess method for the user to guess
    guess(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
  }
  
  public static void guess(int difficulty,int [][]grid,int [][] cellA,int[][] cellB,int[][] cellC,int[][] cellD,int[][] cellE,int[][] cellF,int[][] cellG,int [][] cellH,int [][] cellI){
    //We initialize the variablies needed for the guessing. I will explain what the ceck variable does soon
    int row, col, number, check=-1;
    Scanner scan = new Scanner(System.in);
    
    //Ask the user for the row to access
    do
    {
    System.out.println("What row would you like to access?");
    row= scan.nextInt();
    }
    while(row>8||row<0);//make sure the user doesn't input an invalid row
    
    //Ask user for what column to access
    do
    {
      System.out.println("What col would you like to enter in row " + row + "?");
      col = scan.nextInt();
      //If the difficulty is easy
      if(difficulty==1)
      {
        //if the user enters any of the coordinates for the preset numbers, the user is told that that is invalid 
        if((row==0&&col==0)||(row==1&&col==2)||(row==2&&col==1)||(row==2&&col==2)||(row==0&&col==3)||(row==0&&col==5)||(row==0&&col==8)||(row==1&&col==6)||(row==2&&col==6)||(row==3&&col==0)||(row==5&&col==0)||(row==3&&col==4)||(row==4&&col==3)||(row==4&&col==5)||(row==5&&col==4)||(row==3&&col==8)||(row==5&&col==8)||(row==6&&col==1)||(row==6&&col==2)||(row==7&&col==2)||(row==8&&col==0)||(row==8&&col==3)||(row==8&&col==5)||(row==6&&col==6)||(row==6&&col==7)||(row==7&&col==6)||(row==8&&col==8)||(row==2&&col==7))
        {
          System.out.println("You can't access those boxes, those are preset");
          //The are sent back to gridstate
          gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
        }
      }
      //The same thing is done for medium difficulty, only the coordinates are changed for the medium grid
      if(difficulty==2)
      {
        if((row==0&&col==0)||(row==1&&col==1)||(row==1&&col==2)||(row==0&&col==5)||(row==1&&col==3)||(row==1&&col==5)||(row==0&&col==8)||(row==1&&col==7)||(row==2&&col==7)||(row==3&&col==0)||(row==3&&col==2)||(row==5&&col==1)||(row==4&&col==3)||(row==4&&col==4)||(row==4&&col==5)||(row==3&&col==7)||(row==5&&col==6)||(row==5&&col==8)||(row==6&&col==1)||(row==7&&col==1)||(row==8&&col==0)||(row==7&&col==3)||(row==7&&col==5)||(row==8&&col==3)||(row==7&&col==6)||(row==7&&col==7)||(row==8&&col==8))
        {
          System.out.println("You can't access those boxes, those are preset");
          gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
        }
      }
      //Same thing for hard difficulty
      if(difficulty==3)
      {
        if((row==0&&col==1)||(row==1&&col==0)||(row==0&&col==5)||(row==1&&col==4)||(row==2&&col==3)||(row==1&&col==6)||(row==2&&col==7)||(row==3&&col==2)||(row==4&&col==1)||(row==5&&col==0)||(row==3&&col==4)||(row==4&&col==3)||(row==4&&col==5)||(row==5&&col==4)||(row==3&&col==8)||(row==4&&col==7)||(row==5&&col==6)||(row==6&&col==1)||(row==7&&col==2)||(row==6&&col==5)||(row==7&&col==4)||(row==8&&col==3)||(row==7&&col==8)||(row==8&&col==7))
        {
          System.out.println("You can't access those boxes, those are preset");
          gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
        }
      }
    }while(col>8||col<0);//make sure the user doesn't enter an invalid column
    
    //Ask user for the number they want to input
    do
    {
    System.out.println("What number would you like to enter in row " + row +", col " + col + "?");
    number = scan.nextInt();
    }
    while(number>9||number<1);// make sure user doesn't input an invalid number
    
    //Here's what the check variable does
    //When the row is between 0 and 2 and the column is between 0 and 2, that means that we are in cellA, which is signified by setting check to 0
    if(row>-1&&row<3&&col>-1&&col<3)
    {
      check=0;
    }
    //We do the same for every grid (cellB is check=1, cellC is check = 2, etc)
    if(row>-1&&row<3&&col>2&&col<6)
    {
      check=1;
    }
    //cellC
    if(row>-1&&row<3&&col>5&&col<9)
    {
      check=2;
    }
    //cellD
    if(row>2&&row<6&&col>-1&&col<3)
    {
      check=3;
    }
    //cellE
    if(row>2&&row<6&&col>2&&col<6)
    {
      check=4;
    }
    //cellF
    if(row>2&&row<6&&col>5&&col<9)
    {
      check=5;
    }
    //cellG
     if(row>5&&row<9&&col>-1&&col<3)
    {
      check=6;
    }
     //cellH
    if(row>5&&row<9&&col>2&&col<6)
    {
      check=7;
    }
    //cellI
    if(row>5&&row<9&&col>5&&col<9)
    {
      check=8;
    }
    //Now that we have the user's input, we send all the relevant variables to the valid method, where it checks if the guess is valid.
    valid(difficulty,check,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI,row, col, number); 
  }
  public static void valid(int difficulty,int check, int [][] grid,int [][] cellA,int[][] cellB,int[][] cellC,int[][] cellD,int[][] cellE,int[][] cellF,int[][] cellG,int [][] cellH,int [][] cellI, int row, int col, int number){
    //This for loop checks the row of the guess to find any duplicates
    for(int i=0;i<9;i++)
    {
      //It skips the inputted box to avoid finding a match there
      if (i==col)
      {
      }
      //If it finds a match, it sends the user back to gridstate
      else if(grid[row][i]==number)
      {
        System.out.println("That number is already used in that row, try again");
        gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
      }
    }
    //We do the same exact thing as before, but now we check the columns 
    for(int i=0;i<9;i++)
    {
      if(i==row)
      {
      }
      else if (grid[i][col]==number)
      {
        System.out.println("That number is already used in that col, try again");
        gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
      }
    }
    //If we are in cellA
    if(check==0)
    {
      //We check all the boxes in that cell
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          //We skip the inputted box
          if (i==row&&j==col)
          {
          }
          //If we find a match in the cell, we send them back to gridstate
          if(cellA[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //We do the exact same for cellB if we are in cellB
    if(check==1)
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if (i==row&&j==col)
          {
          }
          if(cellB[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //cellC
    if(check==2)
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if (i==row&&j==col)
          {
          }
          if(cellC[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //cellD
    if(check==3)
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if (i==row&&j==col)
          {
          }
          if(cellD[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //cellE
    if(check==4)
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if (i==row&&j==col)
          {
          }
          if(cellE[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //cellF
    if(check==5)
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if (i==row&&j==col)
          {
          }
          if(cellF[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //cellG
    if(check==6)
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if (i==row&&j==col)
          {
          }
          if(cellG[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //cellH
    if(check==7)
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if (i==row&&j==col)
          {
          }
          if(cellH[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //cellI
    if(check==8)
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          if (i==row&&j==col)
          {
          }
          if(cellI[i][j]==number)
          {
            System.out.println("The number " + number +" is already in the cell!");
            gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
          }
        }
      }
    }
    //If the program runs to this line, we can assume that the guess is valid(as we haven't been sent back) and we send the relevant variables to gridfill
    guessfill(difficulty,row,col,number,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI,check);
  }
  public static void guessfill(int difficulty,int row, int col, int number, int [][]grid,int [][] cellA,int[][] cellB,int[][] cellC,int[][] cellD,int[][] cellE,int[][] cellF,int[][] cellG,int [][] cellH,int [][] cellI,int check){
    //Declare new variables
    int newcol=-1, newrow=-1;
    
    //So if col==0 or 3 or 6, we can assume that the number is in the first column of the cell
    if (col==0||col==3||col==6)
    {
      newcol=0;
    }
    //2nd column
    if (col==1||col==4||col==7)
    {
      newcol=1;
    }
    //3rd column
    if (col==2||col==5||col==8)
    {
      newcol=2;
    }
    //1st row
    if (row==0||row==3||row==6)
    {
      newrow=0;
    }
    //2nd row
    if (row==1||row==4||row==7)
    {
      newrow=1;
    }
    //3rd row
    if (row==2||row==5||row==8)
    {
      newrow=2;
    }
    //We then fill the box on the 9x9 grid with the number
    grid[row][col]=number;
    
    //if we are in cellA, fill the box in the cell with the guess
    if (check==0)
    {
      cellA[newrow][newcol]=number;
    }
    //Same with cellB
    if (check==1)
    {
      cellB[newrow][newcol]=number;
    }
    //cellC
    if (check==2)
    {
      cellC[newrow][newcol]=number;
    }
    //cellD
    if (check==3)
    {
      cellD[newrow][newcol]=number;
    }
    //cellE
    if (check==4)
    {
      cellE[newrow][newcol]=number;
    }
    //cellF
    if (check==5)
    {
      cellF[newrow][newcol]=number;
    }
    //cellG
    if (check==6)
    {
      cellG[newrow][newcol]=number;
    }
    //cellH
    if (check==7)
    {
      cellH[newrow][newcol]=number;
    }
    //cellI
    if (check==8)
    {
      cellI[newrow][newcol]=number;
    }
    //after we have filled all the grids and cells, we send the relevant variables to gridcheck to check if the user has won
    gridcheck(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
  }
  public static void gridcheck(int difficulty,int [][]grid,int [][] cellA,int[][] cellB,int[][] cellC,int[][] cellD,int[][] cellE,int[][] cellF,int[][] cellG,int [][] cellH,int [][] cellI){
    //Declare variables
    int i,j;
    //We check to see if there are any boxes with 0's, or are unfilled
    for (i=0;i<9;i++)
    {
      for(j=0;j<9;j++)
      {
        if(grid[i][j]==0)
        {
          //if there is a box that is unfilled, we go back to gridstate
          gridstate(difficulty,grid,cellA,cellB,cellC,cellD,cellE,cellF,cellG,cellH,cellI);
        }
      }
    }
    //if not, the user has beat the game
    System.out.println("CONGRATULATIONS! YOU BEAT THE GRID!");
    //They are sent back to start
    choosedifficulty();
  }
  
  /* ADD YOUR CODE HERE */
  
}
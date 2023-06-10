class TicTacToeGame 
{
    char[][] board;
    char mark;
    TicTacToeGame()
	{
	  board=new char[3][3];
	  initialBoard();
	}
    
	void initialBoard()//here we initialize the board with spaces instead of null values
	{
		for (int row=0;row<board.length ;row++ )
		{
			for (int col=0;col<board[row].length ;col++ )
			{
               board[row][col]=' ';
			}
		}
	}

	void displayBoard()//This method is used to display the structure of the game
	{
		System.out.println("-------------");
		for (int row=0;row<board.length ;row++ )
		{
          System.out.print("| ");
			for (int col=0;col<board[row].length ;col++ )
			{
               System.out.print(board[row][col]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

    void placeMark(int row,int col,char mark)
	{
	  this.mark=mark;
	  if (row>=0 && row<=2 && col>=0 && col<=2)
	  {
		  board[row][col]=mark;
	  }	
	  else
		{
			System.out.println("Invalid Input:");
		}
           displayBoard();
		//checkWin();
	}

	void checkWin()
	{
		//check rows
		for (int row=0;row<board.length;row++ )
		{
			if (board[row][0]!=' ' && board[row][0]==board[row][1] && board[row][1]==board[row][2])
			{
				System.out.println("Row win of Player:"+mark);
			}
		}

        //check columns
		for (int col=0;col<board.length;col++ )
		{
			if (board[0][col]!=' ' && board[0][col]==board[1][col] && board[1][col]==board[2][col])
			{
				System.out.println("Column win of Player:"+mark);
			}
		}

	 //check diagonally
if(board[0][0]!=0 || board[0][2]!=0)
		{
if(board[0][0]==board[1][1] && board[1][1]==board[2][2] || board[0][2]==board[1][1] && board[1][1]==board[2][0])
		{
			System.out.println("Diagonal win of Player:"+mark);
		}
		}
	}   	
}

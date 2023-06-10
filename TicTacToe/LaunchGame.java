class LaunchGame 
{
	public static void main(String[] args) 
	{
		TicTacToeGame t=new TicTacToeGame();
		t.displayBoard();
		t.placeMark(2,0,'X');
		t.placeMark(2,2,'O');
		t.placeMark(0,2,'X');
		t.placeMark(1,1,'O');
        t.placeMark(0,0,'X');
		t.placeMark(1,0,'O');
        t.placeMark(0,1,'X');
		t.checkWin();
	}
}

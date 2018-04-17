public class TicTacToe {
	private char[][] board;
	private char currentPlayerMark;
	
	public TicTacToe()
	{
		board = new char[3][3];
		currentPlayerMark = 'x';
		initializeBoard();
	}
	
	//Set/Reset the board back to all empty values
	public void initializeBoard()
	{
		
		//Loop through row
		for(int i = 0; i < 3; i++)
		{
			//Loop through columns
			for (int j = 0; j < 3; j++)
			{
				board[i][j] = '-';
			}
		}
	}
	
	//Print the current board (may be replaced by GUI implementation later)
	public void printBoard()
	{
		System.out.println("---------------");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(" | ");
			for(int j = 0; j < 3; j++)
			{
				System.out.println(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("----------------");
		}
	}
	//Loop through all cells of the board and if one is found to be empty (contains char '-')
	//then return false. Otherwise, the board is full
		public boolean isBoardFull()
		{
		boolean isFull = true;
		
		for(int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if(board[i][j] == '-')
				{
					isFull = false;
				}
			}
		}
		return isFull;
		}
		
		//Returns true if there is a win, false otherwise.
		//This calls our other win check functions to check the entire board.
		public boolean checkForWin()
		{
			return(checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
		}
		
		//Loop through rows and see if any are winners
		private boolean checkRowsForWin()
		{
			for(int i = 0; i < 3; i++)
			{
				if(checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
				{
					return true;
				}
			}
			return false;
		}
		
		//Loop through columns and see if any are winners.
		private boolean checkColumnsForWin()
		{
			for(int i = 0; i < 3; i++)
			{
				if(checkRowCol(board[0][i], board[1][i]) == true)
				{
					return true;
				}
			}
			return false;
		}
		
		//Check the two diagonals to see if either is a win. Return true if wither wins
		private boolean checkDiagonalsForWin()
		{
			return((checkRowCol(board[0][0], board[1][1], board[2][2]) == true || (checkRowCol(board[0][2], board[1][1], board[2][0] == true));
		}
		
		//Check to see if all three values are the same(and not empty)indicating a win
		private boolean checkRowCol(char c1, char c2, char c3)
		{
			return ((c1 != '-') && (c1 == c2) && (c2 ==c3));
		}
		
		

	public static void main(String[] args) {
		

	}
}

package game;
import java.util.*;
public class TicTacToe {
	public static void printBoard(char[][] board)
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				System.out.print(board[i][j]+"|");
			}
			System.out.println();
		}
	}
	public static boolean isWinner(char[][]board)
	{
		boolean isWin=false;
		for(int i=0;i<board.length;i++)
		{
			if(board[0][0]==board[0][1]&&board[0][1]==board[0][2]&&board[0][0]!='-')
			{
				return true;
			}
			if(board[1][0]==board[1][1]&&board[1][1]==board[1][2]&&board[1][0]!='-')
			{
				return true;
			}
			if(board[2][0]==board[2][1]&&board[2][1]==board[2][2]&&board[2][0]!='-')
			{
				return true;
			}
			if(board[0][0]==board[1][0]&&board[1][0]==board[2][0]&&board[0][0]!='-')
			{
				return true;
			}
			if(board[0][1]==board[1][1]&&board[1][1]==board[2][1]&&board[0][1]!='-')
			{
				return true;
			}
			if(board[0][2]==board[1][2]&&board[1][2]==board[2][2]&&board[0][2]!='-')
			{
				return true;
			}
			if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]!='-')
			{
				return true;
			}
			if(board[0][2]==board[1][1]&&board[1][1]==board[2][0]&&board[0][2]!='-')
			{
				return true;
			}
		}
		return isWin;
	}
	public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
	char [][]board={{'-','-','-'},{'-','-','-'},{'-','-','-'}};
			int m;
			int n;
			while(true)
			{
				printBoard(board);
				System.out.println("Enter Player 1 position");
				m=o.nextInt();
				n=o.nextInt();
					if(board[m][n]=='-')
					{
						board[m][n]='X';
					if(isWinner(board))
					{
						System.out.println("Player 1 is winner");
						break;
					}
				}
				printBoard(board);
				System.out.println("Enter Player 2 position");
				m=o.nextInt();
				n=o.nextInt();
				if(board[m][n]=='-')
				{
					board[m][n]='O';
				if(isWinner(board))
				{
					System.out.println("Player 2 is winner");
					break;
				}
				}
			}
	}

}

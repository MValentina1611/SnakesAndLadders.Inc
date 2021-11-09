package model;

public class Board {

	//Attributes
	private Square start;
	private Square finish;
	private int n,m,s,e;
	
	
	//Builder
	public Board(int n, int m, int s, int e) 
	{
		this.n = n;
		this.m = m;
		this.s = s;
		this.e = e;
		start = new Square();
		buildBoard();
	}
	
	//---------------------------Methods------------------------
	
	//Build the game board
	public void buildBoard()
	{
		addSquareRows(start, 0, 0);
	}
	
	public void addSquareRows(Square prevSquare, int cols, int rows )
	{
		Square newSquare = new Square();
		
		if(cols < m-1)
		{
			prevSquare.setNext(newSquare);
			newSquare.setPrev(prevSquare);
			addSquareRows(newSquare, cols+1, rows);
		}
		else
		{
			if( rows < n-1 )
			{
				addSquareCols(prevSquare, rows);
			}
			else
			{
				return;
			}
		}
	}

	public void addSquareCols(Square prevSquare, int rows)
	{
		Square newSquare = new Square();
		prevSquare.setTop(newSquare);
		newSquare.setBottom(prevSquare);
		addSquareRows(newSquare,0, rows+1 );
	}
		
  }
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
		buildBoard();
	}
	
	//---------------------------Methods------------------------
	
	
	//Build the game board
	
	public void buildBoard()
	{	
		start = new Square();
		addSquareRowsRight(start,start.getPosition()+1);
		addSquareCols(start,1);
	}

	private void addSquareRowsRight(Square square, int position) 
	{
		if(position < m)
		{
			Square newSquare = new Square();
			square.setNext(newSquare);
			newSquare.setPrev(square);
			addSquareCols(newSquare, 1);
			addSquareRowsRight(newSquare,newSquare.getPosition()+1);
		}
	
	}
	
	private void addSquareCols(Square square, int row)
	{
		if(row < n)
		{
			Square newSquare = new Square();
			square.setTop(newSquare);
			newSquare.setBottom(square);
		
			addSquareCols(newSquare, row++);
		}
	}
		
}

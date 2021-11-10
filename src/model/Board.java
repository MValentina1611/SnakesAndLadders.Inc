package model;

public class Board {

	//Attributes
	private Square start;
	
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
		completeBoardLinks(start.getNext());
		//addPosition(start, 1);
	}
	
	//---------------------------Methods------------------------
	
	//Build the game board
	public void buildBoard()
	{
		addSquareRows(start, 0, 0);
		System.out.println(start.toString());
	}
	
	public void addSquareRows(Square prevSquare, int cols, int rows )
	{
		Square newSquare = new Square();
		
		if(cols < m-1)
		{
			prevSquare.setNext(newSquare);
			newSquare.setPrev(prevSquare);
			addSquareRows(newSquare, cols+1, rows);
			System.out.print(newSquare.toString());
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
		System.out.println(newSquare.toString());
	}

	public void completeBoardLinks(Square toLink)
	{
		Square top = toLink.getPrev().getTop();
		
		if(top == null)
		{
			return;
		}
		else
		{
			toLink.setTop(top.getNext());
			top.getNext().setBottom(toLink);			
			completeBoardLinks(toLink.getTop());
			if( toLink.getNext() != null)
			{
				completeBoardLinks(toLink.getNext());
			}
		}
	}
	 
	/*
	public String printBoard( Square toPrint)
	{
		String info = "";
		
		if( toPrint.getNext() != null )
		{
			info += toPrint.toString();
			printBoard( toPrint.getNext());
			printBoard( toPrint.getTop());
		}
		System.out.println(info);
		
		
	}
	*/
	public Square getStart() 
	{
		return start;
	}
	
  }
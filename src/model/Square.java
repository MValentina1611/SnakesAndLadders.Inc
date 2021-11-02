package model;

public class Square {
	
	private Square previous;
	private Square next;
	private Square top;
	private Square bottom;
	private char ladder;
	private char snake;
	private int position;
	private String players;
	
	public Square( int position )
	{
		this.position = position;
		this.snake = ' ';
		this.ladder = ' ';
		this.players = "";
	}

	public Square getPrevious() {
		return previous;
	}

	public Square getNext() {
		return next;
	}

	public Square getTop() {
		return top;
	}

	public Square getBottom() {
		return bottom;
	}

	public char getLadder() {
		return ladder;
	}

	public char getSnake() {
		return snake;
	}

	public int getPosition() {
		return position;
	}

	public String getPlayers() {
		return players;
	}

	public void setPrevious(Square previous) {
		this.previous = previous;
	}

	public void setNext(Square next) {
		this.next = next;
	}

	public void setTop(Square top) {
		this.top = top;
	}

	public void setBottom(Square bottom) {
		this.bottom = bottom;
	}

	public void setLadder(char ladder) {
		this.ladder = ladder;
	}

	public void setSnake(char snake) {
		this.snake = snake;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void setPlayers(String players) {
		this.players = players;
	}
	
	
	

}

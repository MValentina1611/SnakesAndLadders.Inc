package ui;

import java.util.Scanner;

import model.Game;

public class Menu 
{
	private Game game;
	private static Scanner reader = new Scanner(System.in);
	
	public int showMenu()
	{
		int menuOp = 0;

		String menu = 
			"\t===== W E L C O M E  T O  S N A K E S  A N D  L A D D E R S =====\n" +
			"Pick an option \n" +
			"(1) Play\n" +
			"(2) Exit\n";
		
		System.out.println(menu);
		menuOp = Integer.parseInt(reader.nextLine());
		
		executeOptions( menuOp);
		
		return menuOp;
		
	}
	public void executeOptions(int menuOp) 
	{
		if(menuOp != 2)
		{
			switch( menuOp)
			{
				case 1:
					System.out.println("PLAY GAME");
					showMenu();
			}
		}
		else
		{
			System.out.println("BYE. THANKS FOR PLAY XOXO");
		}
	}
	
	
}



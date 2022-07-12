
public class Tape
{
	private class Cell 
	{
		private char content; 
		private Cell next; 
		private Cell prev; 
	}
	
	private Cell currentCell;
	
	public Tape()
	{
		Cell aCell = new Cell();
		aCell.content = ' '; 
		aCell.next = null;
		aCell.prev = null;
		currentCell = aCell;
	}
	
	
	// getCurrentCell()
	public Cell getCurrentCell()
	{
		return currentCell;
	}
	
	
	// getContent() 
	public char getContent()
	{
		return currentCell.content;
	}
	
	
	// setContent(char ch)
	public void setContent(char ch)
	{
		currentCell.content = ch;
	}
	
	
	// moveLeft()
	public void moveLeft()
	{
		Cell newCell = new Cell(); // create a new cell 
		if(currentCell.prev == null) // if current cell is the left most cell
		{
			currentCell.prev = newCell; // assign new cell to the left of current cell
			newCell.content = ' '; // set the new cell's content to blank space
			newCell.prev = null; // set the left no null 
			newCell.next = currentCell;	// set the current cell to the right of new cell		
		}
		currentCell = currentCell.prev; // moving one cell left
	}
	
	
	// moveRight() 
	public void moveRight()
	{
		Cell newCell = new Cell();
		if(currentCell.next == null)
		{
			currentCell.next = newCell;
			newCell.content = ' ';			
			newCell.next = null;
			newCell.prev = currentCell;
		}
		currentCell = currentCell.next; // set current cell as the right most cell
	}
	
	
	// getTapeContents()
	public String getTapeContents()
	{
		Cell temp = currentCell.prev;
		String characters = null;
		while(temp.next != null)
		{
			characters += + temp.content + ' ';
			System.out.println(temp.content);
			temp = temp.next;
		}
		
		return characters;
	}
}

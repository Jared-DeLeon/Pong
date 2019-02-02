
import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int h, Color c)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	
	public Block(int s, int y, int w, int h)
	{
		xPos = s;
		yPos = y;
		width = w;
		height = h;
		color = Color.BLACK;
	}	
	public Block(int s, int y, int w)
	{
		xPos = s;
		yPos = y;
		width = w;
		height = 10;
		color = Color.BLACK;
	}
	
	public Block(int s, int y)
	{
		xPos = s;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}
	
	public Block(int s)
	{
		xPos = s;
		yPos = 0;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}	
	//add the other set methods
   
   public void setPos( int x, int y)
   {
   		xPos = x;
   		yPos = y;
   }

   public void setX( int x )
   {
   		xPos = x;
   }

   public void setY( int y )
   {
   		yPos = y;
   }

   public int getX()
   {
   		return xPos;
   }

   public int getY()
   {
   		return yPos;
   }
   
   public Color getColor()
   {
   		return color;
   }	
   
   public void setColor(Color col)
   {
   		color = col;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
   		window.setColor(col);
   		window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block rbg = (Block)obj;
		return (xPos == rbg.getX() &&
				yPos == rbg.getY() &&
				width == rbg.getWidth() &&
				height == rbg.getHeight() &&
				color.getRGB() == rbg.getColor().getRGB());
	}   

   //add the other get methods
   public int getWidth()
   {
   		return width;
   }
   
   public int getHeight()
   {
   		return height;
   }		
   //add a toString() method  - x , y , width, height, color
   
   public String toString()
   {
   		return xPos + " " + yPos + " " + width + " " + height + " " + color;
   }
}
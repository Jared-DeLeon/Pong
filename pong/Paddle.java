
import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10,10,60);
      speed =5;
   }
	public Paddle(int x, int y, int w, int h, Color c, int s)
	{
		super(x,y,w,h,c);
		speed = s;
	}
	public Paddle(int x, int y, int w, int h, int s)
	{
		super(x,y,w,h);
		speed = s;
	}
	
	public Paddle(int s, int y, int w, int h)
	{
		super(s,y,w,h);
		speed = 5;
	}	
	public Paddle(int s, int y, int w)
	{
		super(s,y);
		speed = w;
	}
	
	public Paddle(int s, int y)
	{
		super(s,y);
		speed = 5;
	}
	
	public Paddle(int s)
	{
		super(s);
		speed = 5;
	}
	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getSpeed();
	}
   //add the other Paddle constructors
   public void setSpeed(int s)
   {
   	speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
   	draw(window, Color.WHITE);
   	
		//setY
		setY(getY()-speed);

		//draw the ball at its new location
		draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
   	draw(window, Color.WHITE);
   	
		//setY
		setY(getY()+ speed);

		//draw the ball at its new location
		draw(window);

   }

   //add get methods
   public int getSpeed()
   	{
		return speed;
   	}
}
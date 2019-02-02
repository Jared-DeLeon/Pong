
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 1;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y, int w, int h, Color c, int xs, int ys)
	{
		super(x,y,w,h,c);
		xSpeed = xs;
		ySpeed = ys;
	}
	public Ball(int x, int y, int w, int h, Color c, int xs)
	{
		super(x,y,w,h,c);
		xSpeed = xs;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int s, int y, int w, int h)
	{
		super(s,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}	
	public Ball(int s, int y, int w)
	{
		super(s,y,w);
		xSpeed = 3;
		ySpeed = 1;		
	}
	
	public Ball(int s, int y)
	{
		super(s,y);
		xSpeed = 3;
		ySpeed = 1;		
	}
	
	public Ball(int s)
	{
		super(s);
		xSpeed = 3;
		ySpeed = 1;		
	}	   
   //add the set methods
   
   public void setXSpeed(int f)
   {
   		xSpeed = f;
   }	
   	
   public void setYSpeed(int f)
   {
   		ySpeed = f;
   }	

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
   		draw(window, Color.WHITE);
   	
   		setX(getX()+xSpeed);
		//setY
		setY(getY()+ySpeed);

		//draw the ball at its new location
		draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball rbg = (Ball)obj;
		return (getX() == rbg.getX() &&
				getY() == rbg.getY() &&
				getWidth() == rbg.getWidth() &&
				getHeight() == rbg.getHeight() &&
				xSpeed == rbg.getXSpeed() &&
				ySpeed == rbg.getYSpeed() &&
				getColor().getRGB() == rbg.getColor().getRGB());
	}   

   //add the get methods
   public int getXSpeed()
   {
   		return xSpeed;
   }
   
   public int getYSpeed()
   {
   		return ySpeed;
   }
   
   	public boolean didCollideLeft(Object obj)
   	{
   		Paddle leftPaddle = (Paddle)obj;
   		return(getX() == leftPaddle.getX()+10);
   	}

	public boolean didCollideRight(Object obj)
	{
		Paddle rightPaddle = (Paddle)obj;
		return(getX() + 10 == rightPaddle.getX());
	}

	public boolean didCollideTop(Object obj)
	{
		Paddle paddle = (Paddle)obj;
		return (getY() >= paddle.getY());
		
	}

	public boolean didCollideBottom(Object obj)
	{
		Paddle paddle = (Paddle)obj;
		return (getY() <= paddle.getY() + 60);
				
	}

   //add a toString() method
   public String toString()
   {
   		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
   }	
}
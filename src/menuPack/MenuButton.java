package menuPack;

import java.awt.geom.Rectangle2D;

public class MenuButton 
{
	private int width;
	private int height;
	private int x;
	private int y;
	Rectangle2D rect;
	
	public MenuButton(int x, int y, int height, int width)
	{
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public Rectangle2D rectBounds()
	{
		rect.setRect(x, y, width, height);
		return rect;
	}
	
	
}

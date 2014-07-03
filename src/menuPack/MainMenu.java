package menuPack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import main.CurrentMenu;
import main.Game;
import main.MenuMouseInput;
import main.Game.STATE;

public class MainMenu implements CurrentMenu
{
	public Rectangle button0 = new Rectangle(Game.WIDTH / 2 + 120, 150, 275, 50);
	public Rectangle button1 = new Rectangle(Game.WIDTH / 2 + 120, 225, 275, 50);
	public Rectangle button2 = new Rectangle(Game.WIDTH / 2 + 120, 300, 275, 50);
	public Rectangle button3 = new Rectangle(Game.WIDTH / 2 + 120, 375, 275, 50);
	public Rectangle button4 = new Rectangle(Game.WIDTH / 2 + 120, 450, 275, 50);

	
	public MainMenu()
	{
		
	}

	public void tick()
	{
		if(Game.btn0Click == true)
		{
			
		}
		if(Game.btn1Click == true)
		{
			
		}
		if(Game.btn2Click == true)
		{
			
		}
		if(Game.btn3Click == true)
		{
			
		}
		if(Game.btn4Click == true)
		{
			 System.exit(1);
		}
	}
	
	public void render(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.black);
		g.drawString("WASTELAND", Game.WIDTH / 2 + 98, 100);
		
		Font fnt1 = new Font("arial", Font.BOLD, 30);
		g.setFont(fnt1);
		
		g2d.draw(button0);
		g.drawString("Join Game", button0.x + 25, button0.y + 35);
		
		g2d.draw(button1);
		g.drawString("Host Game", button1.x + 25, button1.y + 35);
		
		g2d.draw(button2);
		g.drawString("Select Character", button2.x + 25, button2.y + 35);
		
		g2d.draw(button3);
		g.drawString("Settings", button3.x + 25, button3.y + 35);
		
		g2d.draw(button4);
		g.drawString("Exit", button4.x + 25, button4.y + 35);
		
		
		
	}
}

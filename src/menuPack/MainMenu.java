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
import main.MmMouseInput;
import main.Game.STATE;

public class MainMenu implements CurrentMenu
{
	public Rectangle button0 = new Rectangle(Game.WIDTH / 2 + 120, 150, 200, 50);
	public Rectangle button1 = new Rectangle(Game.WIDTH / 2 + 120, 225, 200, 50);
	public Rectangle button2 = new Rectangle(Game.WIDTH / 2 + 120, 300, 200, 50);
	public Rectangle button3 = new Rectangle(Game.WIDTH / 2 + 120, 375, 200, 50);
	public Rectangle button4 = new Rectangle(Game.WIDTH / 2 + 120, 450, 200, 50);
	public Rectangle button5 = new Rectangle(Game.WIDTH / 2 + 120, 525, 200, 50);
	
	public MainMenu()
	{
		
	}

	public void tick()
	{

	}
	
	public void render(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("WASTELAND", Game.WIDTH / 2, 100);
		
		Font fnt1 = new Font("arial", Font.BOLD, 30);
		g.setFont(fnt1);
		
		g2d.draw(button0);
		g.drawString("button0", button0.x + 25, button0.y + 35);
		
		g2d.draw(button1);
		g.drawString("button1", button1.x + 25, button1.y + 35);
		
		g2d.draw(button2);
		g.drawString("button2", button2.x + 25, button2.y + 35);
		
		g2d.draw(button3);
		g.drawString("button3", button3.x + 25, button3.y + 35);
		
		g2d.draw(button4);
		g.drawString("button4", button4.x + 25, button4.y + 35);
		
		g2d.draw(button5);
		g.drawString("Exit", button5.x + 65, button5.y + 35);
		
	}
}
